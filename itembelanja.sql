-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 05, 2017 at 05:21 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `itembelanja`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE IF NOT EXISTS `barang` (
`id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `merk` varchar(50) NOT NULL,
  `asal_brg` varchar(50) NOT NULL,
  `perusahaan_import` varchar(30) DEFAULT NULL,
  `perusahaan_eksport` varchar(30) DEFAULT NULL,
  `no_import` varchar(30) DEFAULT NULL,
  `no_eksport` varchar(30) DEFAULT NULL,
  `harga` varchar(20) NOT NULL,
  `jml_awal_item` varchar(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id`, `nama`, `merk`, `asal_brg`, `perusahaan_import`, `perusahaan_eksport`, `no_import`, `no_eksport`, `harga`, `jml_awal_item`) VALUES
(2, 'Televisi', 'Samsung', 'Jepang', 'PT. Samsung', 'PT. Cahaya Elektronik', 'I329381-09', 'E12492-08', '2150000', '9000'),
(3, 'Laptop', 'ASUS', 'Jepang', 'PT. ASUS TECH', 'PT. IKA', 'I2938290-02', 'E939283-90', '7000000', '7000'),
(4, 'Handphone', 'Oppo', 'China', 'PT. OPPO', '-', 'I9382938-21', '-', '2100000', '9200'),
(5, 'Headset', 'Sony', 'Jepang', 'PT. REP GAMING', 'PT. IKA', 'I329382-00', 'E394029-00', '400000', '7000');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `username` varchar(8) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin'),
('fathoni', 'k3515020'),
('firman', 'k3515024'),
('leonardo', 'k3515030'),
('novita', 'k3515042');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
 ADD PRIMARY KEY (`username`,`password`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
