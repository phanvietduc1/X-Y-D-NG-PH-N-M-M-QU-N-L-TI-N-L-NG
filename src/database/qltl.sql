-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 28, 2020 at 07:51 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qltl`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `username` varchar(10) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`username`, `password`) VALUES
('admin', 'admin'),
('user', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `chucvu`
--

CREATE TABLE `chucvu` (
  `tenchucvu` varchar(15) NOT NULL,
  `tienchucvu` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chucvu`
--

INSERT INTO `chucvu` (`tenchucvu`, `tienchucvu`) VALUES
('KETOAN', 200000),
('NHANVIEN', 100000),
('PHOPHONG', 300000),
('TRUONGPHONG', 350000),
('THUKY', 280000),
('GIAMDOC', 4800000),
('PHOGIAMDOC', 440000);

-- --------------------------------------------------------

--
-- Table structure for table `luong`
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
-- Dumping data for table `luong`
--

INSERT INTO `luong` (`MALUONG`, `MANV`, `SONGAYLAM`, `HESO`, `PHUCAP`, `TONGLUONG`, `GHICHU`) VALUES
('L01', 'NV01', 26, 4.32, 0, 11232000, ''),
('L02', 'NV02', 26, 3.66, 0, 8418000, ''),
('L03', 'NV03', 26, 2.67, 0, 5073000, ''),
('L04', 'NV04', 26, 3.66, 0, 7320000, ''),
('L05', 'NV05', 26, 3, 0, 5700000, ''),
('L06', 'NV06', 26, 3.66, 0, 9516000, '');


-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
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
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`MANV`, `TENNV`, `GIOITINH`, `NGAYVAOLAM`, `tenchucvu`, `MAPHONG`) VALUES
('NV01', 'TRAN HONG DUC', 'NAM', '2018-03-14', 'TRUONGPHONG', 'P01'),
('NV02', 'NGUYEN THI HOA', 'NU', '2019-03-01', 'PHOPHONG', 'P02'),
('NV03', 'PHAM VAN BACH', 'NAM', '2020-02-01', 'NHANVIEN', 'P03'),
('NV04', 'HO THI THINH', 'NU', '2018-04-12', 'KETOAN', 'P02'),
('NV05', 'PHAN VAN VIET', 'NAM', '2019-04-12', 'NHANVIEN', 'P01'),
('NV06', 'NGUYEN THI TRINH', 'NU', '2020-04-12', 'TRUONGPHONG', 'P03');

-- --------------------------------------------------------

--
-- Table structure for table `phong`
--

CREATE TABLE `phong` (
  `MAPHONG` varchar(10) NOT NULL,
  `TEN` varchar(10) DEFAULT NULL,
  `TIENPHONG` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `phong`
--

INSERT INTO `phong` (`MAPHONG`, `TEN`, `TIENPHONG`) VALUES
('P01', 'NHAN SU', 200000),
('P02', 'KIEM TOAN', 150000),
('P03', 'KIEM KE', 180000),
('P04', 'DIEU HANH', 300000),
('P05', 'MARKETING', 220000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`tenchucvu`);

--
-- Indexes for table `luong`
--
ALTER TABLE `luong`
  ADD PRIMARY KEY (`MALUONG`),
  ADD KEY `FK_MANV` (`MANV`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MANV`),
  ADD KEY `FK_nhanvien` (`MAPHONG`),
  ADD KEY `FK_nhanvien2` (`tenchucvu`);

--
-- Indexes for table `phong`
--
ALTER TABLE `phong`
  ADD PRIMARY KEY (`MAPHONG`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `luong`
--
ALTER TABLE `luong`
  ADD CONSTRAINT `FK_MANV` FOREIGN KEY (`MANV`) REFERENCES `nhanvien` (`MANV`);

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `FK_nhanvien` FOREIGN KEY (`MAPHONG`) REFERENCES `phong` (`MAPHONG`),
  ADD CONSTRAINT `FK_nhanvien2` FOREIGN KEY (`tenchucvu`) REFERENCES `chucvu` (`tenchucvu`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
