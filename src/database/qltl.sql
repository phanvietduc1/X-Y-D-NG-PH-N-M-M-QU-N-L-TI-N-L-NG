-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th7 05, 2020 lúc 04:33 PM
-- Phiên bản máy phục vụ: 10.4.11-MariaDB
-- Phiên bản PHP: 7.2.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qltl`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `account`
--

CREATE TABLE `account` (
  `username` varchar(10) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `account`
--

INSERT INTO `account` (`username`, `password`) VALUES
('admin', 'admin'),
('user', 'user');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chucvu`
--

CREATE TABLE `chucvu` (
  `tenchucvu` varchar(15) NOT NULL,
  `tienchucvu` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `chucvu`
--

INSERT INTO `chucvu` (`tenchucvu`, `tienchucvu`) VALUES
('GIAMDOC', 500000),
('KETOAN', 200000),
('NHANVIEN', 100000),
('PHOGIAMDOC', 440000),
('PHOPHONG', 300000),
('THUKY', 280000),
('TRUONGPHONG', 400000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `luong`
--

CREATE TABLE `luong` (
  `MALUONG` varchar(10) NOT NULL,
  `MANV` varchar(10) NOT NULL,
  `SONGAYLAM` tinyint(4) DEFAULT NULL,
  `HESO` float DEFAULT NULL,
  `PHUCAP` int(11) DEFAULT NULL,
  `TONGLUONG` int(11) DEFAULT NULL,
  `GHICHU` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `luong`
--

INSERT INTO `luong` (`MALUONG`, `MANV`, `SONGAYLAM`, `HESO`, `PHUCAP`, `TONGLUONG`, `GHICHU`) VALUES
('L01', 'NV01', 26, 4.32, 0, 11232000, ''),
('L02', 'NV02', 26, 3.66, 0, 8418000, ''),
('L03', 'NV03', 26, 2.67, 0, 5073000, ''),
('L04', 'NV04', 26, 3.66, 0, 7320000, ''),
('L05', 'NV05', 26, 3, 0, 5700000, ''),
('L06', 'NV06', 26, 3.66, 0, 9516000, ''),
('L07', 'NV07', 26, 2.67, 0, 5700000, ''),
('L08', 'NV08', 26, 4.32, 0, 11232000, ''),
('L09', 'NV09', 26, 2.67, 0, 5700000, ''),
('L10', 'NV10', 26, 2.67, 0, 8418000, ''),
('L11', 'NV11', 26, 3.66, 0, 7320000, ''),
('L12', 'NV12', 26, 2.67, 0, 5700000, ''),
('L13', 'NV13', 26, 5.53, 0, 15270000, ''),
('L14', 'NV14', 26, 4.32, 0, 13270000, ''),
('L15', 'NV15', 26, 3.66, 0, 5700000, ''),
('L16', 'NV16', 26, 4.32, 0, 10500000, ''),
('L17', 'NV17', 26, 4.32, 0, 8640000, ''),
('L18', 'NV18', 26, 3.66, 0, 7320000, ''),
('L19', 'NV19', 26, 2.67, 0, 5700000, ''),
('L20', 'NV20', 26, 3.66, 0, 6588000, '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MANV` varchar(10) NOT NULL,
  `TENNV` varchar(30) DEFAULT NULL,
  `GIOITINH` varchar(5) DEFAULT NULL,
  `NGAYVAOLAM` date DEFAULT NULL,
  `tenchucvu` varchar(15) DEFAULT NULL,
  `MAPHONG` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MANV`, `TENNV`, `GIOITINH`, `NGAYVAOLAM`, `tenchucvu`, `MAPHONG`) VALUES
('NV01', 'TRAN HONG DUC', 'NAM', '2018-03-14', 'TRUONGPHONG', 'P01'),
('NV02', 'NGUYEN THI HOA', 'NU', '2019-03-01', 'PHOPHONG', 'P02'),
('NV03', 'PHAM VAN BACH', 'NAM', '2020-02-01', 'NHANVIEN', 'P03'),
('NV04', 'HO THI THINH', 'NU', '2018-04-12', 'KETOAN', 'P02'),
('NV05', 'PHAN VAN VIET', 'NAM', '2019-04-12', 'NHANVIEN', 'P01'),
('NV06', 'NGUYEN THI TRINH', 'NU', '2020-04-12', 'TRUONGPHONG', 'P03'),
('NV07', 'NGO THAI HUNG', 'NAM', '2020-01-21', 'NHANVIEN', 'P05'),
('NV08', 'VU ANH HAO', 'NAM', '2018-02-16', 'TRUONGPHONG', 'P01'),
('NV09', 'NGUYEN THI THU TRANG', 'NU', '2020-02-09', 'NHANVIEN', 'P03'),
('NV10', 'PHAN ANH', 'NU', '2020-03-13', 'PHOPHONG', 'P02'),
('NV11', 'LE VAN VIET', 'NAM', '2019-06-12', 'KETOAN', 'P02'),
('NV12', 'TRAN NGOC HAN', 'NU', '2020-04-12', 'NHANVIEN', 'P03'),
('NV13', 'TRAN VAN BA', 'NAM', '2017-04-01', 'GIAMDOC', 'P04'),
('NV14', 'NGUYEN THU TRANG', 'NU', '2018-07-30', 'PHOGIAMDOC', 'P04'),
('NV15', 'HOANG THI HOA', 'NU', '2019-03-12', 'NHANVIEN', 'P05'),
('NV16', 'PHAN THI THUY', 'NU', '2018-06-07', 'THUKY', 'P03'),
('NV17', 'HO PHUONG LY', 'NU', '2018-07-21', 'NHANVIEN', 'P03'),
('NV18', 'CHAU NGOC MINH THU', 'NU', '2019-07-20', 'NHANVIEN', 'P03'),
('NV19', 'PHAN NGOC PHUONG NHI', 'NU', '2020-09-20', 'NHANVIEN', 'P03'),
('NV20', 'LE CONG MI', 'NAM', '2019-07-08', 'TRUONGPHONG', 'P03');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phong`
--

CREATE TABLE `phong` (
  `MAPHONG` varchar(10) NOT NULL,
  `TEN` varchar(10) DEFAULT NULL,
  `TIENPHONG` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `phong`
--

INSERT INTO `phong` (`MAPHONG`, `TEN`, `TIENPHONG`) VALUES
('P01', 'NHAN SU', 2200000),
('P02', 'KIEM TOAN', 2000000),
('P03', 'KIEM KE', 1800000),
('P04', 'DIEU HANH', 3000000),
('P05', 'MARKETING', 2500000);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`tenchucvu`);

--
-- Chỉ mục cho bảng `luong`
--
ALTER TABLE `luong`
  ADD PRIMARY KEY (`MALUONG`),
  ADD KEY `FK_MANV` (`MANV`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MANV`),
  ADD KEY `FK_nhanvien` (`MAPHONG`),
  ADD KEY `FK_nhanvien2` (`tenchucvu`);

--
-- Chỉ mục cho bảng `phong`
--
ALTER TABLE `phong`
  ADD PRIMARY KEY (`MAPHONG`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `luong`
--
ALTER TABLE `luong`
  ADD CONSTRAINT `FK_MANV` FOREIGN KEY (`MANV`) REFERENCES `nhanvien` (`MANV`);

--
-- Các ràng buộc cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `FK_nhanvien` FOREIGN KEY (`MAPHONG`) REFERENCES `phong` (`MAPHONG`),
  ADD CONSTRAINT `FK_nhanvien2` FOREIGN KEY (`tenchucvu`) REFERENCES `chucvu` (`tenchucvu`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
