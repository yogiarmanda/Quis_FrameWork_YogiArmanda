-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 12 Des 2017 pada 15.57
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quis_1094`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `cv_1094`
--

CREATE TABLE `cv_1094` (
  `id` bigint(20) NOT NULL,
  `kelas` varchar(255) DEFAULT NULL,
  `nama` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `cv_1094`
--

INSERT INTO `cv_1094` (`id`, `kelas`, `nama`) VALUES
(1, '3 TI C', 'Yogi Armanda'),
(2, '3 TI C', 'Ilham Novitra'),
(3, '3 TI C', 'Ahmad Adli');

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai_1094`
--

CREATE TABLE `nilai_1094` (
  `id` bigint(20) NOT NULL,
  `name` varchar(150) NOT NULL,
  `nilai_harian` varchar(255) DEFAULT NULL,
  `nilai_ujian` varchar(255) DEFAULT NULL,
  `nilai_ulangan` varchar(255) DEFAULT NULL,
  `cv_1094_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `nilai_1094`
--

INSERT INTO `nilai_1094` (`id`, `name`, `nilai_harian`, `nilai_ujian`, `nilai_ulangan`, `cv_1094_id`) VALUES
(1, 'Yogi Armanda', '80', '80', '80', 1),
(2, 'M. Ilham Novitra', '70', '70', '80', 2),
(3, 'Ahmad Adli', '86', '78', '85', 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1094`
--
ALTER TABLE `cv_1094`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_8mqlxh7asgmoop169lij3nkl4` (`nama`);

--
-- Indexes for table `nilai_1094`
--
ALTER TABLE `nilai_1094`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK4e9px21sefw2pik8xjj9jfetc` (`cv_1094_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1094`
--
ALTER TABLE `cv_1094`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `nilai_1094`
--
ALTER TABLE `nilai_1094`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `nilai_1094`
--
ALTER TABLE `nilai_1094`
  ADD CONSTRAINT `FK4e9px21sefw2pik8xjj9jfetc` FOREIGN KEY (`cv_1094_id`) REFERENCES `cv_1094` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
