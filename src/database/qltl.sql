-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 09, 2020 at 03:55 PM
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
-- Table structure for table `luong`
--

CREATE TABLE `luong` (
  `MALUONG` varchar(10) NOT NULL,
  `MANV` varchar(10) DEFAULT NULL,
  `LUONGCOBAN` int(11) DEFAULT NULL,
  `SONGAYLAM` tinyint(4) DEFAULT NULL,
  `PHUCAP` int(11) DEFAULT NULL,
  `TONGLUONG` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `luong`
--

INSERT INTO `luong` (`MALUONG`, `MANV`, `LUONGCOBAN`, `SONGAYLAM`, `PHUCAP`, `TONGLUONG`) VALUES
('L01', 'NV01', 10000000, 30, 500000, 10500000),
('L02', 'NV02', 8000000, 30, 300000, 8300000),
('L03', 'NV03', 7000000, 30, 200000, 7200000),
('L04', 'NV04', 9000000, 30, 300000, 9300000),
('L05', 'NV05', 7000000, 30, 500000, 7500000),
('L06', 'NV06', 10000000, 30, 200000, 10200000);

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MANV` varchar(10) NOT NULL,
  `TENNV` varchar(30) DEFAULT NULL,
  `GIOITINH` varchar(5) DEFAULT NULL,
  `CHUCVU` varchar(15) DEFAULT NULL,
  `MAPHONG` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`MANV`, `TENNV`, `GIOITINH`, `CHUCVU`, `MAPHONG`) VALUES
('NV01', 'TRAN HONG DUC', 'NAM', 'TRUONG PHONG', 'P01'),
('NV02', 'NGUYEN THI HOA', 'NU', 'PHO PHONG', 'P02'),
('NV03', 'PHAM VAN BACH', 'NAM', 'NHAN VIEN', 'P03'),
('NV04', 'HO THI THINH', 'NU', 'KE TOAN', 'P02'),
('NV05', 'PHAN VAN VIET', 'NAM', 'NHAN VIEN', 'P01'),
('NV06', 'NGUYEN THI TRINH', 'NU', 'TRUONG PHONG', 'P03');

-- --------------------------------------------------------

--
-- Table structure for table `phong`
--

CREATE TABLE `phong` (
  `MAPHONG` varchar(10) NOT NULL,
  `TEN` varchar(10) DEFAULT NULL,
  `PHUCAP` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `phong`
--

INSERT INTO `phong` (`MAPHONG`, `TEN`, `PHUCAP`) VALUES
('P01', 'NHAN SU', 500000),
('P02', 'KIEM TOAN', 300000),
('P03', 'KIEM KE', 200000);

--
-- Indexes for dumped tables
--

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
  ADD KEY `FK_nhanvien` (`MAPHONG`);

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
  ADD CONSTRAINT `FK_nhanvien` FOREIGN KEY (`MAPHONG`) REFERENCES `phong` (`MAPHONG`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;