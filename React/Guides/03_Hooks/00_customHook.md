# OPCIÓN 1

## Declaración del hook sin parámetros.
const useCounter = () => {
  const [count, setCount] = useState(0);

  return {
    count,
    increment: () => setCount((prevCount) => prevCount + 1),
  };
};

import React, { useState } from "react";
import useCounter from "./useCounter";

## Llamada al hook sin parámetros.
const Counter = () => {
  const { count, increment } = useCounter();

  return (
    <div>
      <h1>Contador: {count}</h1>
      <button onClick={increment}>Incrementar</button>
    </div>
  );
};

# OPCIÓN 2

## Declaración del hook con parámetros.
export default Counter;

const useFetch = (url, options) => {
  const [data, setData] = useState(null);
  const [loading, setLoading] = useState(true);

  const fetchData = async () => {
    try {
      const response = await fetch(url, options);
      const data = await response.json();
      setData(data);
      setLoading(false);
    } catch (error) {
      console.error(error);
    }
  };

  useEffect(() => {
    fetchData();
  }, [url, options]);

  return { data, loading };
};

## Llamada al hook sin parámetros.
import React, { useState } from "react";
import useFetch from "./useFetch";

const App = () => {
  const { data, loading } = useFetch("https://api.example.com/users");

  return (
    <div>
      {loading ? "Cargando..." : (
        <ul>
          {data.map((user) => (
            <li key={user.id}>{user.name}</li>
          ))}
        </ul>
      )}
    </div>
  );
};

export default App;
