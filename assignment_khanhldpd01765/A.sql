create database QLBH
go
use QLBH
go

create table TAI_KHOAN(
Username nvarchar(50) not null primary key,
Pass nvarchar(50) not null,
Vai_tro nvarchar(50) not null,
Ho_ten nvarchar(50) not null,
Dia_chi nvarchar(50) not null,
Email nvarchar(50) not null,
Sdt nvarchar (15) not null
)

create table LOAI_SP(
Ma_loai nchar(10) not null primary key,
Loai_sp nvarchar(50) not null,
)

create table SAN_PHAM(
Ma_sp nchar(10) not null primary key,
Ten_sp nvarchar(50) not null,
Mo_ta nvarchar(500) not null,
So_luong int not null,
Don_gia float not null,
Hinh_anh nvarchar(200) not null,
Nha_sx nvarchar(50) not null,
Ma_loai nchar(10) not null,
foreign key (Ma_loai) references LOAI_SP(Ma_loai)
)

create table DON_HANG(
Ma_don_hang nchar(10) not null primary key,
Username nvarchar(50) not null,
Ngay_mua datetime not null,
Trang_thai nchar(10),
foreign key (Username) references TAI_KHOAN(Username)
)

create table DON_HANG_CT(
Ma_don_hang_ct nchar(10) not null primary key,
Ma_don_hang nchar(10) not null,
Ma_sp nchar(10) not null,
So_luong int not null,
Gia_tien float not null,
foreign key (Ma_sp) references SAN_PHAM(Ma_sp),
foreign key (Ma_don_hang) references DON_HANG(Ma_don_hang),

)

-- Truy xuất nhập liệu
SELECT * from TAI_KHOAN where Username='khanh' and Pass='123456'
insert into TAI_KHOAN values(
'Khanh','123','admin','Khanh','196 Bach Dang','khanh@gmail.com','01206215477')
insert into TAI_KHOAN values(
'Tan','123','customer','Tan','111 Nguyen Thi Thap','tan@gmail.com','01201111111')
insert into TAI_KHOAN values(
'Hung','123','customer','Hung','222 Nguyen Thi Thap','hung@gmail.com','01202222222')
insert into TAI_KHOAN values(
'Hoang','123','customer','Hoang','333 Nguyen Thi Thap','hoang@gmail.com','01203333333')
go


insert into LOAI_SP values(
'k01','dien thoai')
insert into LOAI_SP values(
'k02','SmartBand')
insert into LOAI_SP values(
'k03','SmartWatch')
insert into LOAI_SP values(
'k04','Tai nghe')
go



insert into SAN_PHAM values(
'sp001','Dien thoai Xperia Z','tinh nang chong tham nuoc, Màn hình lớn. Trải nghiệm giải trí tuyệt vời.',200, 5000000,'images/xperia-z.png','Sony','k01')
insert into SAN_PHAM values(
'sp002','Dien thoai Xperia Z1','tinh nang chong tham nuoc, Tinh hoa công nghệ Sony mang đến cho bạn trải nghiệm tuyệt đỉnh',200, 6000000,'images/xperia-z1.png','Sony','k01')
insert into SAN_PHAM values(
'sp003','Dien thoai Xperia z3','tinh nang chong tham nuoc, Nhẹ hơn, mỏng hơn, nhanh hơnv',200, 7000000,'images/xperia-z3.png','Sony','k01')
insert into SAN_PHAM values(
'sp004','Dien thoai Xperia C4','tinh nang chong tham nuoc, Trở thành chuyên gia chụp ảnh tự sướng',200, 8000000,'images/xperia-c4.png','Sony','k01')
insert into SAN_PHAM values(
'sp005','Dien thoai Xperia Z5','tinh nang chong tham nuoc, điện thoại thông minh 4K hai SIM đầu tiên trên thế giới',200, 9000000,'images/xperia-z5.png','Sony','k01')
insert into SAN_PHAM values(
'sp006','Dien thoai Xperia M2','tinh nang chong tham nuoc',200, 6000000,'images/xperia-m2.png','Sony','k01')
insert into SAN_PHAM values(
'sp007','Dien thoai Xperia XA','tinh nang chong tham nuoc, Chụp ảnh đêm tuyệt đẹp',200, 7000000,'images/xperia-xa.png','Sony','k01')
insert into SAN_PHAM values(
'sp008','Dien thoai Xperia XZ','tinh nang chong tham nuoc, Chụp ảnh sắc nét',200, 14000000,'images/xperia-xz.png','Sony','k01')
insert into SAN_PHAM values(
'sp009','Dien thoai Xperia X','tinh nang chong tham nuoc, Chụp nhanh với độ phân giải 23 MP',200, 10000000,'images/xperia-x.png','Sony','k01')
insert into SAN_PHAM values(
'sp010','Dien thoai Xperia M5','tinh nang chong tham nuoc, Camera tự động lấy nét kép',200, 11000000,'images/xperia-m5.png','Sony','k01')

insert into SAN_PHAM values(
'sp011','SmartBand 2','Trình đo nhịp tim, Trình theo dõi hoạt động, Trình theo dõi mạch và căng thẳng',200, 6000000,'images/smartband2.png','Sony','k02')
insert into SAN_PHAM values(
'sp012','SmartBand Talk SWR30','Cuộc gọi thoại và thông báo, Gia tốc kế và đồng hồ đo độ cao, Màn hình E Ink – tiêu thụ ít năng lượng, hiệu suất cao',200, 5000000,'images/smartband-talk.png','Sony','k02')
insert into SAN_PHAM values(
'sp013','SmartWatch 3 SWR50','Xem thông báo ngay trên cổ tay, Màn hình cảm ứng hiển thị đầy đủ màu sắc, Chuẩn bị sẵn nhạc và nghe trên đường đi',200, 10000000,'images/SmartWatch3.png','Sony','k03')
insert into SAN_PHAM values(
'sp014','Tai nghe Bluetooth® Stereo SBH54','HD voice cho cuộc gọi rõ ràng, Trình phát nhạc và đài FM, Hiển thị thông báo của điện thoại thông minh',200, 3000000,'images/tainghe-sbh54.png','Sony','k04')
insert into SAN_PHAM values(
'sp015','Tai nghe âm thanh độ phân giải cao MDR-NC750','Âm thanh được cải thiện với High-Resolution Audio, Nghe nhạc không gián đoạn với công nghệ Khử tiếng ồn',200, 6000000,'images/tainghe-mdr-nc750.png','Sony','k04')

Select *from TAI_KHOAN
Select *from LOAI_SP
Select *from SAN_PHAM
delete from TAI_KHOAN where Username= 'khanh123'