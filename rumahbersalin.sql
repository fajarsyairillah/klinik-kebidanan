-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 30, 2019 at 08:59 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rumahbersalin`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` varchar(6) NOT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `user_id` varchar(12) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  `hakakses` varchar(12) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `nama`, `user_id`, `password`, `hakakses`) VALUES
('A-002', 'Pendaftaran', 'Daftar', 'Daftar', 'Administrasi'),
('A-001', 'Admin', 'Admin', 'Admin', 'Admin'),
('A-003', 'Bidan', 'Bidan', 'Bidan', 'Bidan');

-- --------------------------------------------------------

--
-- Table structure for table `bidan`
--

CREATE TABLE `bidan` (
  `nip` varchar(8) CHARACTER SET latin1 COLLATE latin1_general_ci NOT NULL,
  `nama` varchar(30) CHARACTER SET latin1 COLLATE latin1_general_ci DEFAULT NULL,
  `alamat` varchar(60) CHARACTER SET latin1 COLLATE latin1_general_ci DEFAULT NULL,
  `RT` varchar(10) NOT NULL,
  `KELURAHAN` varchar(20) NOT NULL,
  `KECAMATAN` varchar(20) NOT NULL,
  `no_telp` varchar(14) CHARACTER SET latin1 COLLATE latin1_general_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bidan`
--

INSERT INTO `bidan` (`nip`, `nama`, `alamat`, `RT`, `KELURAHAN`, `KECAMATAN`, `no_telp`) VALUES
('B-001', 'Tatik', 'kp.sempu no.118 rt.03/03', '', '', '', '085694984803'),
('B-002', 'erni suherni', 'kp.wangkal', '', '', '', '09876567892');

-- --------------------------------------------------------

--
-- Table structure for table `daftar`
--

CREATE TABLE `daftar` (
  `no_daftar` varchar(6) NOT NULL,
  `tanggal` varchar(14) DEFAULT NULL,
  `jam` varchar(8) DEFAULT NULL,
  `no_rm` varchar(6) DEFAULT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `alamat` varchar(50) NOT NULL,
  `RT` varchar(10) NOT NULL,
  `KELURAHAN` varchar(20) NOT NULL,
  `KECAMATAN` varchar(20) NOT NULL,
  `tinggi` int(3) NOT NULL,
  `berat` int(3) NOT NULL,
  `tekanan` varchar(7) NOT NULL,
  `suhu_badan` varchar(3) NOT NULL,
  `periksa` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `daftar`
--

INSERT INTO `daftar` (`no_daftar`, `tanggal`, `jam`, `no_rm`, `nama`, `alamat`, `RT`, `KELURAHAN`, `KECAMATAN`, `tinggi`, `berat`, `tekanan`, `suhu_badan`, `periksa`) VALUES
('D-006', '2019-10-29', '09:58:36', 'p-002', 'Eka Nuramalina', 'Jalan Raya Kalisari', '06/02', 'Ciracas', 'Kalisari', 165, 60, '100/120', '-', 'PERSALINAN '),
('D-005', '2019-10-28', '18:01:12', 'p-007', 'Syendi Nazera Tamadanti', 'Jalan Kirai Indah 2', '05/01', 'Ciracas', 'Kali Sari', 165, 60, '100/120', '-', 'PERIKSA KEHAMILAN'),
('D-004', '2019-10-28', '12:27:22', 'p-012', 'Tunjung Hidayat', 'Jalan Raya Kalisari', '06/02', 'Kalisari', 'Ciracas', 90, 17, '-', '34', 'IMUNISASI'),
('D-003', '2019-10-28', '12:23:37', 'p-002', 'Eka Nuramalina', 'Jalan Raya Kalisari', '06/02', 'Ciracas', 'Kalisari', 165, 60, '100/120', '-', 'PERIKSA KEHAMILAN'),
('D-002', '2019-10-28', '12:14:48', 'P-011', 'Dwija Buana ', 'Jalan Kampung Sawah', '05/01', 'Limo', 'Krukut', 100, 20, '-', '35', 'IMUNISASI'),
('D-001', '2019-10-28', '11:40:17', 'p-001', 'Rina Supriyanti', 'Jalan Kampung Sawah', '05/01', 'Limo', 'Krukut', 167, 60, '90/120', '-', 'PERSALINAN ');

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `kode` varchar(6) NOT NULL,
  `nama_obat` varchar(30) NOT NULL,
  `jenis` varchar(10) DEFAULT NULL,
  `satuan` varchar(10) DEFAULT NULL,
  `harga` varchar(8) DEFAULT NULL,
  `stok` varchar(6) DEFAULT NULL,
  `stokmin` varchar(3) DEFAULT NULL,
  `suplier` varchar(30) DEFAULT NULL,
  `Keterangan` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`kode`, `nama_obat`, `jenis`, `satuan`, `harga`, `stok`, `stokmin`, `suplier`, `Keterangan`) VALUES
('O-004', 'Termorex', 'Syrup', 'Botol', '20000', '45', '3', 'PT. Cikarang Jaya', '3X1 Sehari'),
('O-005', 'Tempra', 'Syrup', 'Botol', '25000', '30', '4', 'PT. Cikarang Jaya', '3X1 Sehari'),
('O-001', 'Rhinos Junior', 'Syrup', 'Botol', '50000', '50', '2', 'PT. Rhinos Farma', '3X1 Sehari'),
('O-002', 'Amoxillin', 'Kapsul', 'Strip', '10000', '70', '5', 'PT. Kalbe Farma', '3X1 Sehari'),
('O-003', 'Rhinos Neo', 'Syrup', 'Botol', '35000', '40', '2', 'PT. Rhinos Farma', '2x1 Sehari'),
('O-006', 'Ampicillin', 'Kapsul', 'Strip', '10000', '50', '5', 'PT. Kalbe Farma', '2x1 Sehari'),
('O-007', 'Metoclopramide', 'Tablet', 'Strip', '7000', '40', '2', 'PT. Kalbe farma', '3X1 Sehari'),
('O-008', 'Kalnex', 'Tablet', 'Strip', '6000', '50', '5', 'PT. Kalbe Farma', '2x1 Sehari'),
('O-009', 'Ketorolac', 'Tablet', 'Strip', '10000', '60', '5', 'PT. Kalbe Farma', '3X1 Sehari'),
('O-010', 'Vitamin B12', 'Syrup', 'Botol', '45000', '60', '5', 'PT. Supra Fatbindo Farma', '1x1 Sehari'),
('O-011', 'Decadryl', 'Syrup', 'Botol', '25000', '70', '5', 'PT. Harsen', '3X1 Sehari'),
('O-012', 'Aspirin', 'Tablet', 'Strip', '10000', '50', '3', 'PT. Kalbe Farma', '2x1 Sehari'),
('O-013', 'Paracetamol', 'Tablet', 'Strip', '10000', '40', '5', 'PT. Kimia Farma', '3X1 Sehari'),
('O-014', 'Misoprostol', 'Tablet', 'Strip', '200000', '20', '2', 'PT. Kimia Farma', '1x1 Sehari');

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `no_rm` varchar(6) NOT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `tgl` date DEFAULT NULL,
  `jenis_kel` varchar(10) DEFAULT NULL,
  `status` varchar(14) DEFAULT NULL,
  `pekerjaan` varchar(20) DEFAULT NULL,
  `alamat` varchar(100) DEFAULT NULL,
  `RT` varchar(10) NOT NULL,
  `KELURAHAN` varchar(20) NOT NULL,
  `KECAMATAN` varchar(20) NOT NULL,
  `nama_hub` varchar(20) NOT NULL,
  `hub_jk` varchar(25) NOT NULL,
  `hubungan` varchar(25) NOT NULL,
  `hub_no_tlp` varchar(14) NOT NULL,
  `no_tlp` varchar(14) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`no_rm`, `nama`, `tgl`, `jenis_kel`, `status`, `pekerjaan`, `alamat`, `RT`, `KELURAHAN`, `KECAMATAN`, `nama_hub`, `hub_jk`, `hubungan`, `hub_no_tlp`, `no_tlp`) VALUES
('P-012', 'Tunjung Hidayat', '2019-08-05', 'LAKI-LAKI', 'BELUM MENIKAH', 'Anak-anak', 'Jalan Raya Kalisari', '06/02', 'Kalisari', 'Ciracas', 'Eka Nuramalina', 'PEREMPUAN', 'IBU', '081316800995', '081316800995'),
('P-007', 'Syendi Nazera Tamadanti', '1994-11-12', 'PEREMPUAN', 'MENIKAH', 'Ibu Rumah Tangga', 'Jalan Kirai Indah 2', '05/01', 'Ciracas', 'Kali Sari', 'Dina Putri', 'PEREMPUAN', 'ANAK', '081316800997', '081316800997'),
('P-008', 'Runi Sarini', '1995-08-07', 'PEREMPUAN', 'MENIKAH', 'Ibu Rumah Tangga', 'Jalan Bedahan Raya', '07/02', 'Sawangan', 'Bedahan', '', 'PILIHAN JENIS KELAMIN', 'PILIHAN HUBUNGAN', '', '087177723907'),
('P-009', 'Husnul Chotima', '2019-09-12', 'PEREMPUAN', 'MENIKAH', 'Ibu Rumah Tangga', 'Jalan Raya Mampang', '07/01', 'Sawangan', 'Mampang', '', 'PILIHAN JENIS KELAMIN', 'PILIHAN HUBUNGAN', '', '082114567321'),
('P-010', 'Radiah Nurfitri', '1996-02-10', 'PEREMPUAN', 'MENIKAH', 'Ibu Rumah Tangga', 'Jalan Raya Kebagusan 2', '05/01', 'Sukmajaya', 'Sukatani', '', 'PILIHAN JENIS KELAMIN', 'PILIHAN HUBUNGAN', '', '081316700992'),
('P-011', 'Dwija Buana ', '2019-04-11', 'LAKI-LAKI', 'BELUM MENIKAH', 'Anak-Anak', 'Jalan Kampung Sawah', '05/01', 'Limo', 'Krukut', 'Rina Supriyanti', 'PEREMPUAN', 'IBU', '082113890047', '082113800047'),
('P-004', 'Fatmawati Dewi', '1994-08-17', 'PEREMPUAN', 'MENIKAH', 'Ibu Rumah Tangga', 'Jalan Sengon Raya', '07/09', 'Ciracas', 'Sengon ', 'Akbar Nuryadin', 'LAKI-LAKI', 'ANAK', '081316800992', '081316800992'),
('P-005', 'Emi Susanti', '1990-09-11', 'PEREMPUAN', 'MENIKAH', 'Ibu Rumah Tangga', 'Jalan H. Jaib ', '05/04', 'Meruyung', 'Gandul', 'Nurul Husnul', 'PEREMPUAN', 'ANAK', '081316800994', '081316800994'),
('P-006', 'Adelia Pramesti', '1995-08-30', 'PEREMPUAN', 'MENIKAH', 'Ibu Rumah Tangga', 'Jalan Nusantara 2', '02/01', 'Pancoran mas', 'Beji ', 'Andri Cristian', 'LAKI-LAKI', 'ANAK', '081316800996', '081316800996'),
('P-001', 'Rina Supriyanti', '1992-10-11', 'PEREMPUAN', 'MENIKAH', 'Ibu Rumah Tangga', 'Jalan Kampung Sawah', '05/01', 'Limo', 'Krukut', 'Dwija Buana Sakti', 'LAKI-LAKI', 'ANAK', '082113890047', '082113890047'),
('P-002', 'Eka Nuramalina', '1995-06-08', 'PEREMPUAN', 'MENIKAH', 'Pegawai Swasta', 'Jalan Raya Kalisari', '06/02', 'Ciracas', 'Kalisari', 'Tunjung Hidayat', 'LAKI-LAKI', 'ANAK', '081316800995', '081316800995'),
('P-003', 'Sindi Kartika', '1996-01-18', 'PEREMPUAN', 'MENIKAH', 'Ibu Rumah Tangga', 'Jalan Rivaria Sawangan', '09/05', 'Sawangan', 'Bedahan', 'Fachriza Adha', 'LAKI-LAKI', 'ANAK', '081316800991', '081316800991'),
('P-013', 'Fachriza Adha', '2019-07-02', 'LAKI-LAKI', 'BELUM MENIKAH', 'Anak-anak', 'Jalan Raya Rivaria', '09/05', 'Bedahan', 'Sawangan', 'Sindi Kartika', 'PEREMPUAN', 'IBU', '081316800991', '081316800991'),
('P-014', 'Akbar Nuryadin', '2019-05-07', 'LAKI-LAKI', 'BELUM MENIKAH', 'Anak-anak', 'Jalan Sengon Raya', '07/09', 'Sengon', 'Ciracas', 'Fatmawati Dewi', 'PEREMPUAN', 'IBU', '081316800992', '081316800992'),
('P-015', 'Nurul Husnul', '2019-02-13', 'PEREMPUAN', 'BELUM MENIKAH', 'Anak-anak', 'Jalan H. Jaib', '05/04', 'Gandul', 'Meruyung', 'Emi Susanti', 'PEREMPUAN', 'IBU', '081316800994', '081316800994'),
('P-016', 'Andri Cristiab', '2019-01-10', 'LAKI-LAKI', 'BELUM MENIKAH', 'Anak-anak', 'Jalan Nusantara 2', '02/01', 'Beji', 'Pancoran Mas', 'Adelia Pramestia', 'PEREMPUAN', 'IBU', '081316800996', '081316800996');

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `no_trans` varchar(7) NOT NULL,
  `tanggal` varchar(14) DEFAULT NULL,
  `jam` varchar(8) DEFAULT NULL,
  `no_rm` varchar(6) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `tot_bayar` varchar(10) DEFAULT NULL,
  `bayar` varchar(10) DEFAULT NULL,
  `kembalian` varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`no_trans`, `tanggal`, `jam`, `no_rm`, `nama`, `tot_bayar`, `bayar`, `kembalian`) VALUES
('TR-004', '2019-10-29', '10:01:45', 'p-002', 'Eka Nuramalina', '415000.0', '450000', '35000.0'),
('TR-003', '2019-10-28', '12:28:42', 'p-012', 'Tunjung Hidayat', '30000.0', '50000', '20000.0'),
('TR-002', '2019-10-28', '12:25:40', 'p-002', 'Eka Nuramalina', '120000.0', '150000', '30000.0'),
('TR-001', '2019-10-28', '12:16:29', 'p-011', 'Dwija Buana ', '15000.', '20000', '5000.0');

-- --------------------------------------------------------

--
-- Table structure for table `periksa`
--

CREATE TABLE `periksa` (
  `no_periksa` varchar(7) NOT NULL,
  `no_rm` varchar(6) NOT NULL,
  `nama` varchar(30) DEFAULT 'NULL',
  `nama_tindakan` varchar(20) NOT NULL,
  `harga_tindakan` varchar(10) NOT NULL,
  `ruang_bersalin` varchar(25) DEFAULT 'NULL',
  `harga_ruang` varchar(10) DEFAULT 'NULL',
  `keadaan_bayi` varchar(30) DEFAULT 'NULL',
  `jenkel_bayi` varchar(20) DEFAULT 'NULL',
  `no_bidan` varchar(8) DEFAULT 'NULL',
  `nama_periksa` varchar(20) NOT NULL,
  `diagnosa` varchar(30) DEFAULT 'NULL',
  `daftar_obat` varchar(150) DEFAULT NULL,
  `tinggi` int(3) NOT NULL,
  `berat` int(3) NOT NULL,
  `tekanan` varchar(7) NOT NULL,
  `tanggal` varchar(14) DEFAULT NULL,
  `jam` varchar(8) DEFAULT NULL,
  `suhu` varchar(3) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `periksa`
--

INSERT INTO `periksa` (`no_periksa`, `no_rm`, `nama`, `nama_tindakan`, `harga_tindakan`, `ruang_bersalin`, `harga_ruang`, `keadaan_bayi`, `jenkel_bayi`, `no_bidan`, `nama_periksa`, `diagnosa`, `daftar_obat`, `tinggi`, `berat`, `tekanan`, `tanggal`, `jam`, `suhu`) VALUES
('PM-006', 'p-002', 'Eka Nuramalina', 'Persalinan', '120000', '2 Hari', '250000', 'Sehat', 'Laki-laki', 'B-001', 'Tatik', 'Melahirkan dengan selamat', 'Vitamin B12,Syrup,1x1 Sehari\r\n', 165, 60, '100/120', '2019-10-29', '10:00:30', '-'),
('PM-003', 'p-002', 'Eka Nuramalina', 'Periksa Kehamilan', '40000', 'LAMA MENGINAP', '0', '', 'JENIS KELAMIN', 'B-001', 'Tatik', 'Cek Kehamilan', 'Ampicillin,Kapsul,2x1 Sehari\r\nDecadryl,Syrup,3X1 Sehari\r\nVitamin B12,Syrup,1x1 Sehari\r\n', 165, 60, '100/120', '2019-10-28', '12:24:38', '-'),
('PM-004', 'p-012', 'Tunjung Hidayat', 'Imunisasi BCG', '30000', 'LAMA MENGINAP', '0', '', 'JENIS KELAMIN', 'B-001', 'Tatik', 'Imunisasi rutin', '', 90, 17, '-', '2019-10-28', '12:28:06', '34'),
('PM-005', 'p-001', 'Rina Supriyanti', 'Persalinan', '120000', '5 Hari', '625000', '5', 'Laki-laki', 'B-001', 'Tatik', 'Melahirkan', 'Metoclopramide,Tablet,3X1 Sehari\r\nMisoprostol,Tablet,1x1 Sehari\r\nVitamin B12,Syrup,1x1 Sehari\r\n', 167, 60, '90/120', '2019-10-28', '16:53:53', '-'),
('PM-002', 'p-011', 'Dwija Buana ', 'Imunisasi Polio', '15000', 'LAMA MENGINAP', '0', '', 'JENIS KELAMIN', 'B-001', 'Tatik', 'Imunisasi Rutin', '', 100, 20, '-', '2019-10-28', '12:15:37', '35');

-- --------------------------------------------------------

--
-- Table structure for table `tindakan`
--

CREATE TABLE `tindakan` (
  `kd_tin` varchar(6) NOT NULL,
  `nama_tin` varchar(20) DEFAULT NULL,
  `harga` varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tindakan`
--

INSERT INTO `tindakan` (`kd_tin`, `nama_tin`, `harga`) VALUES
('T-0001', 'Suntik KB 1 Bulan', '25000'),
('T-0002', 'Suntik KB 3 Bulan', '30000'),
('T-0003', 'Imunisasi DPT', '65000'),
('T-0004', 'Imunisasi Polio', '15000'),
('T-0005', 'Imunisasi BCG', '30000'),
('T-0006', 'Periksa Kehamilan', '40000'),
('T-0007', 'Pengobatan Anak', '40000'),
('T-0008', 'Persalinan', '120000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bidan`
--
ALTER TABLE `bidan`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `daftar`
--
ALTER TABLE `daftar`
  ADD PRIMARY KEY (`no_daftar`);

--
-- Indexes for table `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`kode`) USING BTREE;

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`no_rm`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`no_trans`) USING BTREE;

--
-- Indexes for table `periksa`
--
ALTER TABLE `periksa`
  ADD PRIMARY KEY (`no_periksa`) USING BTREE;

--
-- Indexes for table `tindakan`
--
ALTER TABLE `tindakan`
  ADD PRIMARY KEY (`kd_tin`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
