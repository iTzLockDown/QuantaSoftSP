INSERT INTO `xvi_finpaises` (`id`, `nombre_pais`) VALUES (NULL, 'portugal');
INSERT INTO `xvi_finpaises` (`id`, `nombre_pais`) VALUES (NULL, 'peru');
INSERT INTO `xvi_finpaises` (`id`, `nombre_pais`) VALUES (NULL, 'argentina');
INSERT INTO `xvi_finpaises` (`id`, `nombre_pais`) VALUES (NULL, 'peru');
INSERT INTO `xvi_findeportes` (`id`, `descripcion`, `est_activo`, `nombre`) VALUES (NULL, 'juego de 22 jugadores', '1', 'futbol1');
INSERT INTO `xvi_findeportes` (`id`, `descripcion`, `est_activo`, `nombre`) VALUES (NULL, 'juego de 22 jugadores', '1', 'futbol2');
INSERT INTO `xvi_findeportes` (`id`, `descripcion`, `est_activo`, `nombre`) VALUES (NULL, 'juego de 22 jugadores', '1', 'futbol3');

INSERT INTO `xvi_finusuarios` (`id`, `apellidom`, `apellidop`, `direccion`, `dni`, `email`, `est_activo`, `fecha_nac`, `fecha_reg`, `nombre`, `password`, `sexo`, `telefono`, `pais_id`) VALUES (NULL, 'taype1', 'ruiz1', 'av brasil1', '47418891', 'wilhelm1@gmail.com', '1', '2019-05-01', '2019-05-21', 'wilhelm1', 'progemm', 'M', '930248341', '1');
INSERT INTO `xvi_finusuarios` (`id`, `apellidom`, `apellidop`, `direccion`, `dni`, `email`, `est_activo`, `fecha_nac`, `fecha_reg`, `nombre`, `password`, `sexo`, `telefono`, `pais_id`) VALUES (NULL, 'taype2', 'ruiz2', 'av brasil2', '47418892', 'wilhelm2@gmail.com', '1', '2019-05-02', '2019-05-22', 'wilhelm2', 'progemm', 'M', '930248342', '2');
INSERT INTO `xvi_finusuarios` (`id`, `apellidom`, `apellidop`, `direccion`, `dni`, `email`, `est_activo`, `fecha_nac`, `fecha_reg`, `nombre`, `password`, `sexo`, `telefono`, `pais_id`) VALUES (NULL, 'taype3', 'ruiz3', 'av brasil3', '47418893', 'wilhelm3@gmail.com', '1', '2019-05-03', '2019-05-23', 'wilhelm3', 'progemm', 'M', '930248343', '3');
INSERT INTO `xvi_finusuarios` (`id`, `apellidom`, `apellidop`, `direccion`, `dni`, `email`, `est_activo`, `fecha_nac`, `fecha_reg`, `nombre`, `password`, `sexo`, `telefono`, `pais_id`) VALUES (NULL, 'taype4', 'ruiz4', 'av brasil4', '47418894', 'wilhelm4@gmail.com', '1', '2019-05-04', '2019-05-24', 'wilhelm4', 'progemm', 'M', '930248344', '4');
INSERT INTO `xvi_finusuario_deportistas` (`id`, `altura`, `est_activo`,  `observacion`, `peso`, `deporte_id`, `usuario_id`) VALUES (NULL, '1.75', '1', 'asdasd', '54.5', '1', '1');
INSERT INTO `xvi_finusuario_deportistas` (`id`, `altura`, `est_activo`,  `observacion`, `peso`, `deporte_id`, `usuario_id`) VALUES (NULL, '1.75', '1', 'asdasd', '54.5', '1', '2');
INSERT INTO `xvi_finusuario_deportistas` (`id`, `altura`, `est_activo`,  `observacion`, `peso`, `deporte_id`, `usuario_id`) VALUES (NULL, '1.75', '1', 'asdasd', '54.5', '1', '3');
INSERT INTO `xvi_finusuario_deportistas` (`id`, `altura`, `est_activo`,  `observacion`, `peso`, `deporte_id`, `usuario_id`) VALUES (NULL, '1.75', '1', 'asdasd', '54.5', '1', '4');

INSERT INTO `xvi_finusuario_delegados` (`id`, `cargo`, `est_activo`, `deported_id`, `usuariodl_id`) VALUES (NULL, 'delegado de futbol', '1', '3', '2'), (NULL, 'delegado voley', '1', '1', '3');
INSERT INTO `xvi_finusuario_juez` (`id`, `descripcion`, `observaciones`, `deportej_id`, `usuarioj_id`) VALUES (NULL, 'juez imparcial', 'nada de nada', '2', '4'), (NULL, 'nda de nada ', 'juez parcal', '3', '3');
INSERT INTO `xvi_finequipos` (`id`, `d_decha_registro`, `nombre`, `equipodep_id`, `equipop_id`, `equipoudel_id`) VALUES (NULL, '2019-05-14', 'Delegacion  de Voley Peruano Equipo N° 1', '1', '2', '2');
INSERT INTO `xvi_finequipos` (`id`, `d_decha_registro`, `nombre`, `equipodep_id`, `equipop_id`, `equipoudel_id`) VALUES (NULL, '2019-05-14', 'Delegacion  de Voley Peruano Equipo N° 2', '1', '2', '2');

INSERT INTO `xvi_finequipo_deportistas` (`id`, `depequipoud_id`, `equipode_id`) VALUES (NULL, '1', '1');
INSERT INTO `xvi_finequipo_deportistas` (`id`, `depequipoud_id`, `equipode_id`) VALUES (NULL, '1', '1');
INSERT INTO `xvi_finequipo_deportistas` (`id`, `depequipoud_id`, `equipode_id`) VALUES (NULL, '2', '2');
INSERT INTO `xvi_finequipo_deportistas` (`id`, `depequipoud_id`, `equipode_id`) VALUES (NULL, '3', '2');
INSERT INTO `xvi_finequipo_deportistas` (`id`, `depequipoud_id`, `equipode_id`) VALUES (NULL, '4', '1');