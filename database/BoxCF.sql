
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
	GioiTinh Bit
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
	MaSP varchar(10) PRIMARY KEY NOT NULL,
	TenSP NVARCHAR(50),
	Gia FLOAT,
	HinhAnh VARCHAR(100),
	MoTa NVARCHAR(100),
	MaLoai VARCHAR(10) REFERENCES LoaiSP(MaLoai) ON DELETE NO ACTION,
)
GO

CREATE TABLE LoaiBox(
	MaLoaiBox VARCHAR(10) PRIMARY KEY NOT NULL,
	TenLoaiBox NVARCHAR(50) NOT NULL,
	GiaLoai FLOAT,
	MoTa NVARCHAR(100),
)
GO

--Khi xóa loại box thì xóa luôn combo có chứa loại box đó
CREATE TABLE Combo(
	MaCB VARCHAR(10) PRIMARY KEY NOT NULL,
	TenCB NVARCHAR(50) NOT NULL,
	Gia FLOAT,	
	MaLoaiBox VARCHAR(10) REFERENCES LoaiBox(MaLoaiBox) ON DELETE CASCADE,
	SoLuong int,
	SoLuong_DoUong INT,
	SoLuong_Mon INT,
	MoTa NVARCHAR(100),
)


select * from Combo

GO

CREATE TABLE ComboCT(
	MaComboCT int not null identity,
	MaHD INT NOT NULL REFERENCES HoaDon(MaHD),
	MaCB VARCHAR(10) REFERENCES Combo(MaCB),
	MaSP varchar(10) REFERENCES SanPham(MaSP),
	MaBox VARCHAR(10) REFERENCES Box(MaBox),
	SoLuong int,
	GhiChu NVARCHAR(100),
	CONSTRAINT PK_ComBoCT PRIMARY KEY (MaComboCT ,MaHD, MaCB)
)

Go

--Gía box lấy theo giá loại box
--Ko đc xóa loại box khi có box thuộc loại box đó
CREATE TABLE Box(
	MaBox VARCHAR(10) PRIMARY KEY NOT NULL,
	TenBox NVARCHAR(50) NOT NULL,
	HinhAnh VARCHAR(100),
	MoTa NVARCHAR(20),
	MaLoaiBox VARCHAR(10) REFERENCES LoaiBox(MaLoaiBox) ON DELETE NO ACTION,
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
	TrangThai BIT,
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

--drop table PhieuDatBox

CREATE TABLE PhieuDatBox(
	MaHD INT NOT NULL REFERENCES HoaDon(MaHD),
	MaBox VARCHAR(10) NOT NULL REFERENCES Box(MaBox),
	TenKH NVARCHAR(50),
	GioBD DATETIME,
	GioKT DATETIME,
	SoGio int,
	TraTruoc INT,
	ThanhTien INT,
	TienThucNhan INT,
	TrangThai NVARCHAR(20),
	GhiChu NVARCHAR(50),
	CONSTRAINT PK_PhieuDatBox PRIMARY KEY (MaHD, MaBox),
)
GO

CREATE TABLE HoaDonCT(
	MaHD INT REFERENCES HoaDon(MaHD) ON DELETE NO ACTION,
	MaSP varchar(10) REFERENCES sanPham(MaSP) ON DELETE NO ACTION,
	SoLuong INT,
	GhiChu NVARCHAR(100),
	ThanhTien INT,
)

go

--Nhân viên
Insert into NhanVien values ('NV01', N'Lâm Ngọc Vy', '2000/09/29', '0987654321', N'Sóc Trăng', '123','gondel.jpg', '2022/12/22', N'User', 1, 0)
Insert into NhanVien values ('NV02', N'Trần PHước Duy', '2003/01/03', '0123456789', N'Sóc Trăng', '123',null, '2023/01/10', N'User', 0, 1)
Insert into NhanVien values ('NV03', N'Lê Nguyễn Hoàng Khang', '1999/03/07', '0396884192', N'Cần Thơ', '123',null, '2023/01/12', N'User', 1, 1)
Insert into NhanVien values ('NV04', N'Nguyễn Ngọc Hân', '1997/01/12', '0978153512', N'An Giang', '123',null, '2022/11/01', N'Admin', 1, 0)
Insert into NhanVien values ('NV05', N'Hứa Hoàng Phát', '1998/02/12', '0398844177', N'Cần Thơ', '123',null, '2022/02/22', N'User', 0, 1)

--Danh mục
Insert into DanhMuc values ('DM01', N'Đồ ăn')
Insert into DanhMuc values ('DM02', N'Đồ Uống')
Insert into DanhMuc values ('DM05', N'Khác')

--Loại SP
Insert into LoaiSP values ('LSP01', N'Nước ngọt có gas', 'DM02')
Insert into LoaiSP values ('LSP02', N'Nước ép', 'DM02')
Insert into LoaiSP values ('LSP03', N'Sinh tố', 'DM02')
Insert into LoaiSP values ('LSP04', N'Đồ khô', 'DM01')
Insert into LoaiSP values ('LSP05', N'Trái cây', 'DM01')
Insert into LoaiSP values ('LSP06', N'Bánh ngọt', 'DM01')
Insert into LoaiSP values ('LSP07', N'Trà sữa', 'DM02')



--Sản phẩm

Insert into SanPham values ('NE001',N'Nước Cam' , 25000, 'nuoccam.jpg', '123', 'LSP02')
Insert into SanPham values ('NE002',N'Nước Ép Táo' , 20000, 'eptao.jpg', '234', 'LSP02')
Insert into SanPham values ('BN001',N'Bánh Gato' , 50000, 'gato.jpg', '345', 'LSP06')
Insert into SanPham values ('BN002',N'Bông Lan Trứng Muối' , 60000, 'bonglantrungmuoi.jpg', '678','LSP06')
Insert into SanPham values ('NN001',N'Coca' , 15000, 'coca.jpg', '922', 'LSP01')
Insert into SanPham values ('NN002',N'Pesi' , 15000, 'pesi.jfif', '922', 'LSP01')
Insert into SanPham values ('NN003',N'7up' , 15000, '7up.jfif', '922', 'LSP01')
Insert into SanPham values ('TS001',N'Trà sữa truyền thống' , 25000, 'trasua.jpg', '922', 'LSP07')
Insert into SanPham values ('ST001',N'Sinh tố bơ' , 18000, 'bo.jpg', '922', 'LSP03')
Insert into SanPham values ('ST002',N'Sinh tố dâu' , 18000, 'dau.jpg', '922', 'LSP03')

select * from SanPham

--Loại box
select * from LoaiBox

Insert into LoaiBox values ('S', N'Đơn', 100000, null)
Insert into LoaiBox values ('M', N'Đôi', 200000, null)
Insert into LoaiBox values ('L', N'Nhóm 4', 300000, null)
Insert into LoaiBox values ('XL', N'Nhóm 6', 300000, null)

--Combo
Insert into Combo values ('CB01S', N'Combo 1',100000, 'abc', 'S', 5, 2, 2)
Insert into Combo values ('CB02M', N'Combo 2',200000, 'abc', 'M', 2, 2, 2)
Insert into Combo values ('CB03L', N'Combo 3',300000, 'abc', 'L', 3, 2, 2)
Insert into Combo values ('CB04XL', N'Combo 4',300000, 'abc', 'XL', 3, 1, 2)
Insert into Combo values ('CB05S', N'Combo 5',100000, 'abc', 'S', 1, 2, 1)

select * from ComboCT
select * from PhieuDatBox



GO

--Box
select * from box
select * from loaibox

Insert into Box values ('B001S', N'Box 1', null, N'Mới', 'S')
Insert into Box values ('B002M', N'Box 2', null, N'Mới', 'M')
Insert into Box values ('B003L', N'Box 3', null, N'Mới', 'L')
Insert into Box values ('B004XL', N'Box 4', null, N'Mới', 'XL')
Insert into Box values ('B005S', N'Box 5', null, N'Mới', 'S')
Insert into Box values ('B006M', N'Box 6', null, N'Mới', 'M')
Insert into Box values ('B007L', N'Box 7', null, N'Mới', 'L')
Insert into Box values ('B008L', N'Box 8', null, N'Mới', 'L')
Insert into Box values ('B009S', N'Box 9', null, N'Mới', 'S')
Insert into Box values ('B010M', N'Box 10', null, N'Mới', 'M')
Insert into Box values ('B011XL', N'Box 11', null, N'Mới', 'XL')
Insert into Box values ('B012L', N'Box 12', null, N'Mới', 'L')

--Khuyến mãi
Insert into KhuyenMai values ('KM01', N'Tri ân khách hàng','2022/10/20', '2022/10/25', 100, 5, 100000, 1)
Insert into KhuyenMai values ('KM02', N'Khuyến mãi combo','2023/01/01', '2023/01/02', 100, 10, 200000, 1)
Insert into KhuyenMai values ('KM03', N'Tri ân khách hàng','2023/02/14', '2023/02/15', 100, 15, 300000, 1)
Insert into KhuyenMai values ('KM04', N'Tri ân khách hàng','2023/03/14', '2023/03/16', 100, 20, 500000, 1)







GO

--------ha code------------


-- start proc --


create proc sp_DatBox @MaHD int, @MaBox varchar(10), @TenKH nvarchar(50), @GioBD DATETIME, @GioKT DATETIME, @soGio int, @TraTruoc int, @ThanhTien int,@TienThucNhan int, @TrangThai NVARCHAR(20), @ghiChu nvarchar(50)
as 
begin
	Insert into PhieuDatBox values(@MaHD, @MaBox, @TenKH, @GioBD, @GioKT, @soGio, @TraTruoc, @ThanhTien, @TienThucNhan, @TrangThai, @ghiChu)
end

go

create proc sp_nhan_box @MaHD int, @MaBox nvarchar(10), @thanhTien int
as 
begin
	update HoaDon
	set TongTien  = @thanhTien
	where MaHD = @MaHD

	update PhieuDatBox
	set TrangThai = 'active', TienThucNhan = @thanhTien, GhiChu = N'Da thanh toan'
	where MaHD = @MaHD and MaBox = @MaBox
end

go

create proc sp_update_DatBox @TrangThai NVARCHAR(20), @GioKT DATETIME, @MaBox varchar(10), @gioKTMoi Datetime
as 
begin
	update PhieuDatBox
	set TrangThai = @TrangThai, GioKT = @gioKTMoi
	where MaBox = MaBox and GioKT = @GioKT
end

go
--update lai khi nhan box
create proc sp_update_NhanBox @MaBox varchar(10), @gioBD datetime
as 
begin
	update PhieuDatBox
	set TrangThai = 'active', ghichu = 'Đã thanh toán'
	where MaBox = @MaBox and GioBD = @GioBD
end
Go


-- thong ke - start


-- ngày gần nhất
SELECT top 7 CONVERT(VARCHAR(10),NgayTao,112), SUM(TongTien)
FROM HoaDon
GROUP BY CONVERT(VARCHAR(10),NgayTao,112)
order by CONVERT(VARCHAR(10),NgayTao,112) desc

-- tháng gần nhất
select top 7 MONTH(NgayTao), SUM(TongTien) from HoaDon
group by MONTH(NgayTao)
order by MONTH(NgayTao) desc

-- năm gần nhất
select top 7 YEAR(NgayTao), SUM(TongTien) from HoaDon
group by YEAR(NgayTao)
order by YEAR(NgayTao) desc

-- khoan thoi gian
Go


-- proc doanh so theo khoan thoi gian
--drop proc sp_select_dt

create proc sp_select_dt @timeStart datetime, @timeEnd datetime
as
begin
	select top 10 CONVERT(VARCHAR(10),NgayTao,112), SUM(TongTien) from HoaDon
	where NgayTao <= @timeEnd and NgayTao >= @timeStart
	GROUP BY CONVERT(VARCHAR(10),NgayTao,112)
	order by CONVERT(VARCHAR(10),NgayTao,112) desc
end


exec sp_select_dt  '2022-01-03', '2022-12-31 '


GO
-- combo trong ngay
create proc sp_combo_in_ngay @ngayBd datetime, @ngayKt datetime
as
begin

declare @t table (mahd int, gia int)

insert into @t
select distinct MaHD, Gia from Combo cb
join ComboCT ct on ct.MaCB = cb.MaCB
where ct.MaHD in (select MaHD from HoaDon where NgayTao <= @ngayBd and NgayTao >= @ngayKt)

select SUM(gia) as tongtien from @t

end

exec sp_combo_in_ngay '2023-04-13 23:59:59', '2023-04-13 00:00:00'

-----

-- doanh thu san pham theo khoan thoi gian

--drop proc sp_doanhthu_sanpham

create proc sp_doanhthu_sanpham @timeStart datetime, @timeEnd datetime
as
begin
	declare @t table (id nvarchar(20), name nvarchar(50), price float, quantity int)

	insert into @t (id,name, price, quantity)
	select ct.MaSP, sp.TenSP, sp.Gia, sum(SoLuong) as soluong from HoaDonCT ct
	join HoaDon hd on hd.MaHD = ct.MaHD
	join SanPham sp on sp.MaSP = ct.MaSP
	where ct.MaSP is not null and NgayTao <= @timeEnd and NgayTao >= @timeStart
	group by ct.MaSP, sp.TenSP, sp.Gia
	order by sum(SoLuong) desc

	select top 10 * from @t
	order by quantity desc
end


exec sp_doanhthu_sanpham   '2023-04-03', '2023-04-04'


go


-- proc nang xuat nhan vien
create proc sp_nangxuat_nv @timeStart datetime, @timeEnd datetime
as
begin
	select top 10  hd.MaNV,TenNV, NgayVaoLam, SUM(SoLuong) as soluong from HoaDon hd
	join HoaDonCT ct on ct.MaHD = hd.MaHD
	join NhanVien nv on nv.MaNV = hd.MaNV
	where  TrangThai = 1 and NgayTao <= @timeEnd and NgayTao >= @timeStart
	group by  hd.MaNV, TenNV, NgayVaoLam
end

exec sp_nangxuat_nv   '2022-04-03', '2023-04-04'

-- hoa don - start
go

	create proc sp_insert_bill @tenKM nvarchar(50), @maNV varchar(10), @ghichu nvarchar(255), @tongTien float, @maKm nvarchar(10)
	as
	begin

		Insert into HoaDon values(getdate(), @tenKM, @maNV, @ghichu, @tongTien, @maKm)

		update KhuyenMai
		set SoLuot = SoLuot  - 1
		where MaKM = @maKm 
	end
	exec sp_insert_bill N'Trần Phước Vinh', 'NV02', null, 270000, 'B0606101'

-- end proc--











