# COMO FUNCIONA REACT
        - React es declarativo.
        - Evalúa expresiones que retornan un valor mediante {}
                Ejemplo:
                        - Una constante, una variable o un atributo que almacenan un valor.
                        - Match.Ramdon para retornar un valor aleatorio.
        - If sería una declaración y no una expresión.
        - Los atributos de las etiquetas en React se usan en modo camelCase porque es JS y no HTML.

# PASO 1) OBTENER EL ID DE UN ELEMENTO PARA SER USADO COMO RAÍZ

const appDomElement = document.getElementById('app');

# PASO 2) CREAR LA RAÍZ DEL DOM DE REACT EN EL ELEMENTO APP ANTERIOR

const root = React.DOM.createRoot(appDomElement);

# PASO 3) RENDERIZAR NUESTROS ELEMENTOS EN EL CÓDIGO RAÍZ

const botton = React.createElement{'button', {"data ID": 123}, button 1};               // {'elemento', {props}, contenido};
root.render('Hello, World!');

# PASO 4) RENDERIZAR VARIOS ELEMENTOS EN UN ELEMENTO
const div = React.createElement(React.Fragment, null, [button1, button2, button3]);

# RESUMEN
        App.jsx <-  ->