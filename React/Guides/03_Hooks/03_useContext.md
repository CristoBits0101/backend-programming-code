# OPCIÓN 1
import React, { useContext, createContext } from 'react';

// Creamos un contexto llamado UserContext que contendrá la información del usuario.
const UserContext = createContext();

// Creamos un componente llamado UserProvider que actúa como proveedor de datos.
function UserProvider({ children }) {
  // Definimos la información del usuario que queremos compartir.
  const user = {
    name: 'John Doe',
    email: 'johndoe@example.com',
  };

  // Usamos UserContext.Provider para proporcionar la información del usuario a través del contexto.
  return <UserContext.Provider value={user}>{children}</UserContext.Provider>;
}

// Creamos un componente UserProfile que utilizará la información del usuario a través del contexto.
function UserProfile() {
  // Usamos useContext(UserContext) para acceder a la información del usuario desde el contexto.
  const user = useContext(UserContext);

  return (
    <div>
      <h2>Perfil de Usuario</h2>
      <p>Nombre: {user.name}</p>
      <p>Email: {user.email}</p>
    </div>
  );
}

// Componente principal App que envuelve UserProfile con UserProvider.
function App() {
  return (
    <UserProvider>
      <div>
        <h1>Aplicación de Ejemplo</h1>
        {/* UserProfile puede acceder a la información del usuario a través del contexto. */}
        <UserProfile />
      </div>
    </UserProvider>
  );
}

export default App;
