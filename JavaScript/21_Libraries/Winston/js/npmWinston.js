/**
 *  - Administrar registros profesionalmente.
 *  - Paso uno: descargar -> https://www.npmjs.com/package/winston.
 *  - Paso dos: npm instala winston.
 *  - Paso tres: copie el código del sitio web. 
 */
const winston = require('winston');

const logger = winston.createLogger(
{
  level: 'info',
  // Puedes cambiar el formato del documento.
  format     : winston.format.json(),     
  defaultMeta: {service: 'user-service'},
  transports : 
  [
    /**
     * - Escriba todos los registros con un nivel de importancia de `error` o menos en `error.log`.
     * - Escriba todos los registros con un nivel de importancia de `info` o menos en `combined.log`.
     * - Mensaje de pantalla.
     */
    new winston.transports.Console(),
    new winston.transports.File({ filename: 'error.log', level: 'error'}),
    new winston.transports.File({ filename: 'combined.log' }),
  ],
});

/**
 *  - Cambiar consola por registrador.
 *  - Logger.log("mensaje en pantalla");
 *  - Niveles que guarda Winston en el documento. 
 */
logger.info("informative message");
logger.debug("debug message");
logger.warn("warning message");
logger.error("error message");

// next: node npmWinston.js and create 2 file (combined.log and error.log).