import React, { useState, useEffect } from "react";
import "./App.css";

const useCounter = () => {
  const [count, setCount] = useState(0);

  return {
    count,
    increment: () => setCount((count) => count + 1),
  };
};

function App() {
  const { count, increment } = useCounter();

  useEffect(() => {
    alert("Efecto ejecutado cuando cambia el estado de count al incrementar");
  }, [count]);

  return (
    <div>
      <h1>Contador: {count}</h1>
      <button onClick={increment}>Incrementar</button>
    </div>
  );
}

export default App;
