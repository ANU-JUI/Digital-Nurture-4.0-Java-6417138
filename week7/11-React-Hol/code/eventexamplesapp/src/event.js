function EventHandler() {
  const handleClick = () => {
    window.alert("I am clicked!");
  };
  const welcome=() =>{
    window.alert("Welcome");
  };
  return (
    <div style={{ padding: '10px 20px'}}>
      <button onClick={welcome} style={{ padding: '10px 20px', fontSize: '1rem' }}>
       Say Welcome
      </button>
      <br></br>
       <button onClick={handleClick} style={{ padding: '10px 20px', marginRight: '10px', fontSize: '1rem' }}>
        Click on Me
      </button>
    </div>
  );
}
export default EventHandler;

