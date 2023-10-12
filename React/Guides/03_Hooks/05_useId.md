# OPCIÓN 1

function MyComponent() {
  const id = useId();
  const [state, setState] = useState({
    value: 0,
  });

  useEffect(() => {
    // Actualizar el estado cuando el componente se actualiza
  }, [id]);

  return (
    <div id={id}>
      El valor actual es {state.value}.
      <button onClick={() => setState({ value: state.value + 1 })}>
        +1
      </button>
    </div>
  );
}