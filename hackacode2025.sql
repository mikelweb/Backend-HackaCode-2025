SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Base de datos: `hackacode2025`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Appointment`
--

CREATE TABLE `Appointment` (
  `id` int(10) UNSIGNED NOT NULL,
  `fecha_consulta` date NOT NULL,
  `hora_consulta` time NOT NULL,
  `un_paciente` int(10) UNSIGNED NOT NULL,
  `un_medico` int(10) UNSIGNED NOT NULL,
  `id_servicio_o_paquete` int(10) UNSIGNED NOT NULL,
  `monto_total` decimal(7,2) NOT NULL,
  `pagado_o_no` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Doctor`
--

CREATE TABLE `Doctor` (
  `id_doctor` int(10) UNSIGNED NOT NULL,
  `id_persona` int(10) UNSIGNED NOT NULL,
  `especialidad` varchar(128) NOT NULL,
  `turnos_disponibles` varchar(128) NOT NULL,
  `sueldo` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `MedicalService`
--

CREATE TABLE `MedicalService` (
  `codigo_servicio` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `descripcion` varchar(512) NOT NULL,
  `precio` decimal(7,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `MedicalService`
--

INSERT INTO `MedicalService` (`codigo_servicio`, `nombre`, `descripcion`, `precio`) VALUES
(1, 'Consulta general', 'Lorem ipsum dolor sit amet', 220.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Patient`
--

CREATE TABLE `Patient` (
  `id_paciente` int(10) UNSIGNED NOT NULL,
  `id_persona` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Person`
--

CREATE TABLE `Person` (
  `id_persona` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(128) NOT NULL,
  `apellido` varchar(128) NOT NULL,
  `dni` varchar(128) NOT NULL,
  `fecha_nac` date NOT NULL,
  `email` varchar(128) NOT NULL,
  `telefono` varchar(128) NOT NULL,
  `direccion` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ServicePack`
--

CREATE TABLE `ServicePack` (
  `codigo_paquete` int(10) UNSIGNED NOT NULL,
  `lista_servicios_incluidos` int(10) UNSIGNED NOT NULL,
  `precio_paquete` decimal(7,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ServicePack_Service`
--

CREATE TABLE `ServicePack_Service` (
  `id` int(10) UNSIGNED NOT NULL,
  `service_id` int(10) UNSIGNED NOT NULL,
  `service_pack_id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Appointment`
--
ALTER TABLE `Appointment`
  ADD PRIMARY KEY (`id`),
  ADD KEY `doctor_id` (`un_medico`),
  ADD KEY `patient_id` (`un_paciente`) USING BTREE,
  ADD KEY `pack_service_id` (`id_servicio_o_paquete`) USING BTREE;

--
-- Indices de la tabla `Doctor`
--
ALTER TABLE `Doctor`
  ADD PRIMARY KEY (`id_doctor`),
  ADD KEY `id_persona` (`id_persona`);

--
-- Indices de la tabla `MedicalService`
--
ALTER TABLE `MedicalService`
  ADD PRIMARY KEY (`codigo_servicio`);

--
-- Indices de la tabla `Patient`
--
ALTER TABLE `Patient`
  ADD PRIMARY KEY (`id_paciente`),
  ADD KEY `persona_id` (`id_persona`);

--
-- Indices de la tabla `Person`
--
ALTER TABLE `Person`
  ADD PRIMARY KEY (`id_persona`);

--
-- Indices de la tabla `ServicePack`
--
ALTER TABLE `ServicePack`
  ADD PRIMARY KEY (`codigo_paquete`);

--
-- Indices de la tabla `ServicePack_Service`
--
ALTER TABLE `ServicePack_Service`
  ADD PRIMARY KEY (`id`),
  ADD KEY `service_id` (`service_id`),
  ADD KEY `service_pack_id` (`service_pack_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Appointment`
--
ALTER TABLE `Appointment`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Doctor`
--
ALTER TABLE `Doctor`
  MODIFY `id_doctor` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `MedicalService`
--
ALTER TABLE `MedicalService`
  MODIFY `codigo_servicio` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `Patient`
--
ALTER TABLE `Patient`
  MODIFY `id_paciente` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Person`
--
ALTER TABLE `Person`
  MODIFY `id_persona` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ServicePack`
--
ALTER TABLE `ServicePack`
  MODIFY `codigo_paquete` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ServicePack_Service`
--
ALTER TABLE `ServicePack_Service`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Appointment`
--
ALTER TABLE `Appointment`
  ADD CONSTRAINT `Appointment_ibfk_1` FOREIGN KEY (`un_paciente`) REFERENCES `Patient` (`id_paciente`),
  ADD CONSTRAINT `Appointment_ibfk_2` FOREIGN KEY (`un_medico`) REFERENCES `Doctor` (`id_doctor`),
  ADD CONSTRAINT `Appointment_ibfk_3` FOREIGN KEY (`id_servicio_o_paquete`) REFERENCES `MedicalService` (`codigo_servicio`);

--
-- Filtros para la tabla `Doctor`
--
ALTER TABLE `Doctor`
  ADD CONSTRAINT `Doctor_ibfk_1` FOREIGN KEY (`id_persona`) REFERENCES `Person` (`id_persona`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `Patient`
--
ALTER TABLE `Patient`
  ADD CONSTRAINT `Patient_ibfk_1` FOREIGN KEY (`id_persona`) REFERENCES `Person` (`id_persona`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `ServicePack_Service`
--
ALTER TABLE `ServicePack_Service`
  ADD CONSTRAINT `ServicePack_Service_ibfk_1` FOREIGN KEY (`service_id`) REFERENCES `MedicalService` (`codigo_servicio`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ServicePack_Service_ibfk_2` FOREIGN KEY (`service_pack_id`) REFERENCES `ServicePack` (`codigo_paquete`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;
