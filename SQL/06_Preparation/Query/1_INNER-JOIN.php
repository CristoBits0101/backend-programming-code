SELECT
  entradasblog.id,
  entradasblog.titulo,
  entradasblog.contenido,
  entradasblog.fechapublicacion,
  categorias.nombre AS categoria
FROM
  entradasblog
INNER JOIN
  categorias
ON
  entradasblog.categoriaid = categorias.id
