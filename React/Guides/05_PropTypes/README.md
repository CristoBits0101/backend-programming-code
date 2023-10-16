# Se usa para establecer que tipo de datos de espera en un componente de tipo función.

# Para tipar los parámetros de una función.

## Opción 1
const MyComponent = ({ title }) => {
  // ...
};

MyComponent.propTypes = {
  title: PropTypes.string,
};

## Opción 2

const MyComponent = ({ title }) => {
  // ...
};

MyComponent.propTypes = {
  title: PropTypes.string.isRequired,
};