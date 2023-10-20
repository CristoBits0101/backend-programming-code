# OPCIÓN 1

function MyComponent() {

  const formId = useId()
  const inputId = useId()

  return (
    <>
      <form id={formId}>
        <label htmlFor={inputId}>Campo con id automático</label>
        <input id={inputId} type="checkbox" name="react" />
      </form>
    </>
  );
}