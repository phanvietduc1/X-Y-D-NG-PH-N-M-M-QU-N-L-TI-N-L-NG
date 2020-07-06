-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th7 06, 2020 lúc 05:33 PM
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
('GIAMDOC', 480000),
('KETOAN', 200000),
('NHANVIEN', 100000),
('PHOGIAMDOC', 440000),
('PHOPHONG', 300000),
('THUKY', 280000),
('TRUONGPHONG', 350000);

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
('L07', 'NV07', 23, 3, 0, 12420000, ''),
('L08', 'NV08', 25, 4.32, 0, 32400000, ''),
('L09', 'NV09', 20, 2.67, 0, 10680000, ''),
('L10', 'NV10', 26, 5.53, 0, 43134000, NULL),
('L11', 'NV11', 21, 2.67, 100000, 12435400, 'Thứ 5: tăng ca '),
('L12', 'NV12', 17, 2.67, -20000, 9965800, 'Thứ 6: Làm việc riêng'),
('L13', 'NV13', 22, 3.33, 0, 14652000, ''),
('L14', 'NV14', 24, 2.67, 0, 11534400, ''),
('L15', 'NV15', 25, 2.67, -50000, 13300000, 'Thứ 3: Đi trễ'),
('L16', 'NV16', 19, 2.67, 0, 11160600, ''),
('L17', 'NV17', 22, 2.67, 34000, 11782000, ' Thứ 4: Năng suất');

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
('NV07', 'NGUYEN VAN DUC', 'NAM', '2019-03-09', 'KETOAN', 'P03'),
('NV08', 'HOANG THU HUONG', 'NU', '2018-04-27', 'PHOGIAMDOC', 'P04'),
('NV09', 'NGUYEN THI TRANG', 'NU', '2020-06-19', 'NHANVIEN', 'P01'),
('NV10', 'PHAN THI LINH', 'NU', '2018-01-01', 'GIAMDOC', 'P04'),
('NV11', 'NGUYEN VAN MANH', 'NAM', '2019-04-06', 'NHANVIEN', 'P05'),
('NV12', 'PHAN ANH', 'NAM', '2020-05-16', 'NHANVIEN', 'P05'),
('NV13', 'HO PHUONG LY', 'NAM', '2018-12-12', 'PHOPHONG', 'P01'),
('NV14', 'CHAU NGOC MINH THU', 'NAM', '2020-09-13', 'NHANVIEN', 'P03'),
('NV15', 'GIA HA GIA HUY', 'NU', '2018-04-13', 'NHANVIEN', 'P01'),
('NV16', 'LE VO DINH KHA', 'NU', '2020-02-19', 'NHANVIEN', 'P05'),
('NV17', 'BUI CANH LONG', 'NU', '2020-09-21', 'NHANVIEN', 'P01');

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
('P01', 'NHAN SU', 200000),
('P02', 'KIEM TOAN', 150000),
('P03', 'KIEM KE', 180000),
('P04', 'DIEU HANH', 300000),
('P05', 'MARKETING', 220000);

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
