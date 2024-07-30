-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 23, 2024 at 07:52 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `main_db_billingsys`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_register`
--

CREATE TABLE `admin_register` (
  `Admin_id` varchar(15) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Gender` varchar(15) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Contact` varchar(15) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin_register`
--

INSERT INTO `admin_register` (`Admin_id`, `Name`, `Gender`, `Email`, `Contact`, `Password`) VALUES
('ADM001', 'Isfahan ', 'Laki - Laki', 'Fancysx@gmail.com', '088290546986', 'voinx'),
('ADM002', 'Kaysano', 'Perempuan', 'KePepedia@gmail.com', '081806847590', 'kepedia');

-- --------------------------------------------------------

--
-- Table structure for table `buyer`
--

CREATE TABLE `buyer` (
  `id` int(11) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Contact` varchar(255) NOT NULL,
  `Menu` varchar(255) NOT NULL,
  `Price` varchar(255) NOT NULL,
  `Qty` int(4) NOT NULL,
  `Discount` varchar(255) NOT NULL,
  `Total` varchar(255) NOT NULL,
  `Date` varchar(12) NOT NULL,
  `Time` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `buyer`
--

INSERT INTO `buyer` (`id`, `Name`, `Contact`, `Menu`, `Price`, `Qty`, `Discount`, `Total`, `Date`, `Time`) VALUES
(1, 'Han', '092137894351', 'Kue Pancong (Keju)', '13000', 2, '8%', 'Rp. 23920', '24-07-2024', '00 : 42: 27 WIB'),
(2, 'Kaysano', '092137894352', 'French Fries', '15000', 5, '8%', 'Rp. 69,000', '24-07-2024', '00 : 42: 27 WIB');

-- --------------------------------------------------------

--
-- Table structure for table `food_drink`
--

CREATE TABLE `food_drink` (
  `Product_id` varchar(15) NOT NULL,
  `Menu` varchar(255) NOT NULL,
  `Jenis` varchar(25) NOT NULL,
  `Harga` int(10) NOT NULL,
  `Stock` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `food_drink`
--

INSERT INTO `food_drink` (`Product_id`, `Menu`, `Jenis`, `Harga`, `Stock`) VALUES
('MN001', 'French Fries', 'Food ', 15000, 'Ready Stock'),
('MN002', 'Nasi Goreng ', 'Food ', 18000, 'Ready Stock'),
('MN003', 'Nasi Goreng Special', 'Food ', 22000, 'Ready Stock'),
('MN004', 'Nasi Goreng Kambing', 'Food ', 27000, 'Ready Stock'),
('MN005', 'Nasi Goreng Seafood', 'Food ', 30000, 'Ready Stock'),
('MN006', 'Ayam Geprek + Nasi', 'Food ', 23000, 'Ready Stock'),
('MN007', 'Nasi', 'Food ', 5000, 'Ready Stock'),
('MN008', 'Ayam Bakar/Goreng', 'Food ', 18000, 'Ready Stock'),
('MN009', 'Spagethi', 'Food ', 22000, 'Ready Stock'),
('MN010', 'Dimsum (5pcs)', 'Food ', 20000, 'Ready Stock'),
('MN011', 'Dimsum (10pcs)', 'Food ', 35000, 'Ready Stock'),
('MN012', 'Kue Pancong (Polos)', 'Food ', 8000, 'Ready Stock'),
('MN013', 'Kue Pancong (Coklat)', 'Food ', 10000, 'Ready Stock'),
('MN014', 'Kue Pancong (Keju)', 'Food ', 13000, 'Ready Stock'),
('MN015', 'Kue Pancong (Matcha)', 'Food ', 15000, 'Out Of Stock'),
('MN016', 'Kue Pancong (Red Velvet)', 'Food ', 20000, 'Ready Stock'),
('MN017', 'Lumpia (5pcs)', 'Food ', 20000, 'Ready Stock'),
('MN018', 'Aqua', 'Drink', 5000, 'Ready Stock');

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `Customer_id` varchar(15) NOT NULL,
  `Nama` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Contact` varchar(255) NOT NULL,
  `Gender` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`Customer_id`, `Nama`, `Email`, `Contact`, `Gender`) VALUES
('VX001', 'Han', 'han@gmail.com', '092137894351', 'Laki - Laki'),
('VX002', 'Kaysano', 'kaysano@gmail.com', '092137894352', 'Laki - Laki'),
('VX003', 'Fhia', 'fhia@gmail.com', '092137894353', 'Perempuan'),
('VX004', 'Adelia', 'adelia@gmail.com', '092137894351', 'Perempuan'),
('VX005', 'Daniel', 'daniel@gmail.com', '092137894354', 'Non Binary'),
('VX006', 'Sukri', 'sukri@gmail.com', '092131231321', 'Perempuan');

-- --------------------------------------------------------

--
-- Table structure for table `topupgames`
--

CREATE TABLE `topupgames` (
  `id` int(255) NOT NULL,
  `UID` varchar(255) NOT NULL,
  `Nominal` varchar(28) NOT NULL,
  `Price` varchar(15) NOT NULL,
  `Payment` varchar(255) NOT NULL,
  `Contact` varchar(15) NOT NULL,
  `Total` varchar(255) NOT NULL,
  `Date` varchar(15) NOT NULL,
  `Time` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `topupgames`
--

INSERT INTO `topupgames` (`id`, `UID`, `Nominal`, `Price`, `Payment`, `Contact`, `Total`, `Date`, `Time`) VALUES
(71, 'demonHAN#mayy', '3957 VP', 'Rp. 368705', 'Gopay (Admin + 2500)', '088290546986', 'Rp. 371205.0', '24-07-2024', '00:33:40'),
(72, 'Kepedia#jws', '2800 V-Bucks', 'Rp. 430159', 'BCA VA (Admin + 5500)', '09123983161616', 'Rp. 435659.0', '24-07-2024', '00:35:08'),
(73, '49401631(2083)', '706 Diamons', 'Rp. 168945', 'Gopay (Admin + 2500)', '028218910', 'Rp. 171445.0', '24-07-2024', '00:36:10'),
(74, 'Vxzlaiveter@gmail.com', '24000 Cash PB', 'Rp. 186000', 'Shoppe Pay (Admin + 2500)', '0120919291', 'Rp. 188500.0', '24-07-2024', '00:38:21'),
(75, 'kepedia(japan)', '8080 Genesis Crystal', 'Rp. 1141790', 'MANDIRI VA (Admin + 4500)', '123214564536534', 'Rp. 1146290.0', '24-07-2024', '00:39:04'),
(76, 'han@gmail.com', '250,000 Steam Wallet', 'Rp. 252366', 'Qris (Admin + 1000)', '099999999999', 'Rp. 253366.0', '24-07-2024', '00:40:24');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_register`
--
ALTER TABLE `admin_register`
  ADD PRIMARY KEY (`Admin_id`);

--
-- Indexes for table `buyer`
--
ALTER TABLE `buyer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `food_drink`
--
ALTER TABLE `food_drink`
  ADD PRIMARY KEY (`Product_id`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`Customer_id`) USING BTREE;

--
-- Indexes for table `topupgames`
--
ALTER TABLE `topupgames`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `buyer`
--
ALTER TABLE `buyer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `topupgames`
--
ALTER TABLE `topupgames`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=77;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
