CREATE DATABASE BoxCF
GO
USE BoxCF
GO

CREATE TABLE NhanVien(
	MaNV VARCHAR(20) PRIMARY KEY NOT NULL,
	TenNV NVARCHAR(50) NOT NULL,
	NgaySinh DATE,
	SDT VARCHAR(15),
	DiaChi NVARCHAR(100),
	MatKhau VARCHAR(20),
	HinhAnh VARCHAR(100),
	NgayVaoLam DATE,
	VaiTro NVARCHAR(50),
	TrangThai BIT,
)

GO

CREATE TABLE DanhMuc(
	MaDM VARCHAR(10) PRIMARY KEY NOT NULL,
	TenDM NVARCHAR(100),
)


GO

CREATE TABLE LoaiSP(
	MaLoai VARCHAR(10) PRIMARY KEY NOT NULL,
	TenLoai NVARCHAR(50) NOT NULL,
	MaDM VARCHAR(10) REFERENCES DanhMuc(MaDM) ON DELETE NO ACTION,
)


GO


CREATE TABLE SanPham(
	MaSP INT IDENTITY PRIMARY KEY NOT NULL,
	TenSP NVARCHAR(50),
	Gia FLOAT,
	HinhAnh VARCHAR(100),
	MoTa NVARCHAR(100),
	MaLoai VARCHAR(10) REFERENCES LoaiSP(MaLoai) ON DELETE NO ACTION,
)

CREATE TABLE LoaiBox(
	MaLoaiBox VARCHAR(10) PRIMARY KEY NOT NULL,
	TenLoaiBox NVARCHAR(50) NOT NULL,
	GiaLoai FLOAT,
	MoTa NVARCHAR(100),
)
--Khi xóa loại box thì xóa luôn combo có chứa loại box đó
CREATE TABLE Combo(
	MaCB VARCHAR(10) PRIMARY KEY NOT NULL,
	TenCB NVARCHAR(50) NOT NULL,
	Gia FLOAT,
	MoTa NVARCHAR(100),
	MaLoaiBox VARCHAR(10) REFERENCES LoaiBox(MaLoaiBox) ON DELETE CASCADE,
	SoLuong INT,
)
GO


CREATE TABLE ComboCT(
	MaCB VARCHAR(10) REFERENCES Combo(MaCB),
	MaSP INT REFERENCES SanPham(MaSP),
	GhiChu NVARCHAR(100),
	CONSTRAINT PK_ComBoCT PRIMARY KEY (MaCB, MaSP)
)

--Gía box lấy theo giá loại box
--Ko đc xóa loại box khi có box thuộc loại box đó
CREATE TABLE Box(
	MaBox INT IDENTITY PRIMARY KEY NOT NULL,
	TenBox NVARCHAR(50) NOT NULL,
	HinhAnh VARCHAR(100),
	TrangThai NVARCHAR(20),
	MaLoaiBox VARCHAR(10) REFERENCES LoaiBox(MaLoaiBox) ON DELETE NO ACTION,
	GhiChu NVARCHAR(100),
)
GO


CREATE TABLE DatBox(
	MaDat INT IDENTITY PRIMARY KEY NOT NULL,
	TenKH NVARCHAR(50),
	GioBD DATETIME,
	GioKT DATETIME,
	TrangThai NVARCHAR(20),
	MaBox INT REFERENCES Box(MaBox) ON DELETE NO ACTION,
)
GO


CREATE TABLE KhuyenMai(
	MaKM VARCHAR(10) PRIMARY KEY NOT NULL,
	TenKM NVARCHAR(50) NOT NULL,
	NgayBD DATE,
	NgayKT DATE,
	SoLuot INT,
	PhanTram INT,
	DieuKienGiam INT,
)
GO


CREATE TABLE HoaDon(
	MaHD INT IDENTITY PRIMARY KEY NOT NULL,
	NgayTao DATETIME,
	TenKH NVARCHAR(50),
	MaNV VARCHAR(20) REFERENCES NhanVien(MaNV), 
	GhiChu NVARCHAR(100),
	TongTien INT,
	MaKM VARCHAR(10) REFERENCES KhuyenMai(MaKM),
)
GO


CREATE TABLE HoaDonCT(
	MaHD INT REFERENCES HoaDon(MaHD) ON DELETE NO ACTION,
	MaSP INT REFERENCES sanPham(MaSP) ON DELETE NO ACTION,
	SoLuong INT,
	GhiChu NVARCHAR(100),
	ThanhTien INT,
	MaDat INT REFERENCES DatBox(MaDat) ON DELETE NO ACTION,
)
GO


--Nhân viên
Insert into NhanVien values ('NV01', N'Lâm Ngọc Vy', '2000/09/29', '0987654321', N'Sóc Trăng', '123',null, '2022/12/22', N'User', 1)
Insert into NhanVien values ('NV02', N'Trần PHước Duy', '2003/01/03', '0123456789', N'Sóc Trăng', '123',null, '2023/01/10', N'User', 0)
Insert into NhanVien values ('NV03', N'Lê Nguyễn Hoàng Khang', '1999/03/07', '0396884192', N'Cần Thơ', '123',null, '2023/01/12', N'User', 1)
Insert into NhanVien values ('NV04', N'Nguyễn Ngọc Hân', '1997/01/12', '0978153512', N'An Giang', '123',null, '2022/11/01', N'Admin', 1)
Insert into NhanVien values ('NV05', N'Hứa Hoàng Phát', '1998/02/12', '0398844177', N'Cần Thơ', '123',null, '2022/02/22', N'User', 0)


GO

--Danh mục
Insert into DanhMuc values ('DM01', N'Đồ ăn')
Insert into DanhMuc values ('DM02', N'Đồ Uống')
Insert into DanhMuc values ('DM03'	,N'Combo')
Insert into DanhMuc values ('DM04', N'Box')
Insert into DanhMuc values ('DM05', N'Khác')

GO

--Loại SP
Insert into LoaiSP values ('SP01', N'Nước giải khát', 'DM02')
Insert into LoaiSP values ('SP02', N'Đồ nước', 'DM01')
Insert into LoaiSP values ('SP03', N'Nước có gas', 'DM02')
Insert into LoaiSP values ('SP04', N'Đồ khô', 'DM01')
Insert into LoaiSP values ('SP05', N'Nước trái cây', 'DM02')

GO

select * from SanPham

--Sản phẩm
Insert into SanPham values (N'Nước Cam' , 25000, '/com/boxcf/images/nuoccam.jpg', '123', 'SP05')
Insert into SanPham values (N'Nước Ép Táo' , 20000, '/com/boxcf/images/eptao.jpg', '234', 'SP05')
Insert into SanPham values (N'Bánh Gato' , 50000, '/com/boxcf/images/gato.jpg', '345', 'SP04')
Insert into SanPham values (N'Bông Lan Trứng Muối' , 60000, '/com/boxcf/images/bonglantrungmuoi.jpg', '678','SP04')
Insert into SanPham values (N'Coca' , 15000, '/com/boxcf/images/coca.jpg', '922', 'SP03')
Insert into SanPham values (N'Pesi' , 15000, '/com/boxcf/images/pesi.jfif', '922', 'SP03')
Insert into SanPham values (N'7up' , 15000, '/com/boxcf/images/7up.jfif', '922', 'SP03')
Insert into SanPham values (N'Trà sữa truyền thống' , 25000, '/com/boxcf/images/trasua.jpg', '922', 'SP03')
Insert into SanPham values (N'Sinh tố bơ' , 18000, '/com/boxcf/images/bo.jpg', '922', 'SP03')
Insert into SanPham values (N'Sinh tố dâu' , 18000, '/com/boxcf/images/dau.jpg', '922', 'SP03')

GO

select * from DanhMuc

select * from LoaiSP

select * from LoaiBox

--Loại box
Insert into LoaiBox values ('BX01', N'Đơn', 100000, null)
Insert into LoaiBox values ('BX02', N'Đôi', 200000, null)
Insert into LoaiBox values ('BX03', N'Nhóm', 300000, null)
Insert into LoaiBox values ('BX04', N'Nhóm', 300000, null)
Insert into LoaiBox values ('BX05', N'Đơn', 100000, null)

GO

--Combo
Insert into Combo values ('CB01', N'',100000, 'abc', 'BX01', 5)
Insert into Combo values ('CB02', N'',200000, 'abc', 'BX02', 2)
Insert into Combo values ('CB03', N'',300000, 'abc', 'BX03', 3)
Insert into Combo values ('CB04', N'',300000, 'abc', 'BX04', 3)
Insert into Combo values ('CB05', N'',100000, 'abc', 'BX05', 1)

GO

--ComboCT
Insert into ComboCT values ('CB01',1, 'abc')
Insert into ComboCT values ('CB02',2, 'hhh')
Insert into ComboCT values ('CB03',3, 'ppp')
Insert into ComboCT values ('CB04',4, 'ccc')
Insert into ComboCT values ('CB05',5, 'ggg')

GO

--Box
Insert into Box values (N'Box 1', null, N'Trống', 'BX01', 'Box 1')
Insert into Box values (N'Box 2', null, N'Trống', 'BX03', 'Box 2')
Insert into Box values (N'Box 3', null, N'Trống', 'BX02', 'Box 3')
Insert into Box values (N'Box 4', null, N'Trống', 'BX04', 'Box 4')
Insert into Box values (N'Box 1', null, N'Trống', 'BX01', 'Box 1')
Insert into Box values (N'Box 2', null, N'Trống', 'BX03', 'Box 2')
Insert into Box values (N'Box 3', null, N'Trống', 'BX02', 'Box 3')
Insert into Box values (N'Box 4', null, N'Trống', 'BX04', 'Box 4')
Insert into Box values (N'Box 1', null, N'Trống', 'BX01', 'Box 1')
Insert into Box values (N'Box 2', null, N'Trống', 'BX03', 'Box 2')
Insert into Box values (N'Box 3', null, N'Trống', 'BX02', 'Box 3')
Insert into Box values (N'Box 4', null, N'Trống', 'BX04', 'Box 4')

select * from box
where MaLoaiBox = 'BX01'

select * from LoaiBox

update Box
set TrangThai = 'inActive'
where MaBox = 1

select * from DatBox
GO

--Đặt box
Insert into DATBOX values(N'Nguyễn Ngọc Anh', '10:34:09 AM', '11:34:09 AM', N'', 1)
Insert into DATBOX values(N'Như Ý', '09:10:00 AM', '10:10:00 AM', N'', 4)
Insert into DATBOX values(N'Nguyễn Ngọc Ngân', '08:20:00 AM', '09:20:00 AM', N'', 2)
Insert into DATBOX values(N'Trần Phước Vinh', '10:00:00 AM', '11:00:00 AM', N'', 3)
Insert into DATBOX values(N'Phan Huỳnh Tuyết Nhi', '01:30:00 PM', '02:30:00 PM', N'', 1)

GO

--Khuyến mãi
Insert into KhuyenMai values ('KM01', N'Tri ân khách hàng','2022/10/20', '2022/10/25', 10, 10, null)
Insert into KhuyenMai values ('KM02', N'Khuyến mãi combo','2023/01/01', '2023/01/02', 15, 10, null)
Insert into KhuyenMai values ('KM03', N'Tri ân khách hàng','2023/02/14', '2023/02/15', 14, 10, null)
Insert into KhuyenMai values ('KM04', N'Tri ân khách hàng','2023/03/14', '2023/03/16', 10, 10, null)

GO

--Hóa đơn
Insert into HoaDon values('2023/03/10', N'Trần Phước Vinh', 'NV02', null, 270000, 'KM02')
Insert into HoaDon values('2023/03/11', N'Nguyễn Ngọc Ngân', 'NV03', null, 180000, 'KM03')
Insert into HoaDon values('2023/03/12', N'Phan Huỳnh Tuyết Nhi', 'NV01', null, 90000, 'KM04')
Insert into HoaDon values('2023/03/10', N'Như Ý', 'NV02', null, 270000, 'KM02')
Insert into HoaDon values('2023/03/10', N'Nguyễn Ngọc Anh', 'NV01', null, 90000, 'KM02')

GO

--Hóa đơn chi tiết
Insert into HoaDonCT values ( 1, 3, null, 270000,null)
Insert into HoaDonCT values (2, 3, 2, null, 180000,3)
Insert into HoaDonCT values (5, 5, 1, null, 90000,1)
Insert into HoaDonCT values (3, 4, 3, null, 270000,4)
Insert into HoaDonCT values (4, 2, 1, null, 90000,5)

GO

delete from DatBox
select * from DatBox
where TrangThai = 'isActive' and GioKT like '18:17:28'




Go

create proc sp_DatBox @TenKH nvarchar(50), @GioBD DATETIME, @GioKT DATETIME, @TrangThai NVARCHAR(20), @MaBox int
as 
begin

	update Box 
	set TrangThai = @TrangThai
	where MaBox = @MaBox


	Insert into DATBOX values(@TenKH, @GioBD, @GioKT, @TrangThai, @MaBox)
end

go

create proc sp_update_DatBox @TrangThai NVARCHAR(20), @GioKT DATETIME, @MaBox int
as 
begin

	update Box
	set TrangThai = @TrangThai
	where MaBox = @MaBox

	update DatBox
	set TrangThai = @TrangThai
	where MaBox = MaBox and GioKT = @GioKT


end


select * from DATBOX 

Insert into HoaDonCT values (1, null, 2, null, 270000, 23)

delete from HoaDonCT

select * from Box

select * from DatBox

select * from HoaDon
select * from HoaDonCT
select * from KhuyenMai
select * from NhanVien


exec sp_DatBox N'khang', '10:34:09 AM', '11:34:09 AM', 'isactive', 1


Go

drop table DatTruoc
create table DatTruoc(
	MaDT int identity primary key not null,
	MaBox int REFERENCES Box(MaBox) ON DELETE CASCADE,
	TenKH nvarchar(50),
	GioBD datetime,
	GioKT datetime,
	TranThai bit default 1
)

select * from DatTruoc
order by GioKT 


delete from DatTruoc
update DatTruoc
set TranThai = 1
where MaDT = 6


insert into DatTruoc 
values	(1, N'Phạm Nhứt Khang', '2023/3/28 18:00:00', '2023/3/28 22:00:00', 1),
		(1, N'Phạm Nhứt Khang', '2023/3/28 23:00:00', '2023/3/29 00:00:00', 1),
		(1, N'Phạm Nhứt Khang', '2023/3/29 4:00:00', '2023/3/29 6:00:00', 1)

select * from DATBOX where MaBox = 1 and TrangThai = 'isActive'



