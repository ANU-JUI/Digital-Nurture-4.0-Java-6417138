import logo from './logo.svg';
import './App.css';
import Currency from './currency';
import EventHandler from './event';
import Counter from './incr_decr';
function App() {
  return (
   <div>
    <Counter/>
    <EventHandler/>
    <h1 style={{color: 'green'}}> Currency Convertor!!!</h1>
    <Currency/>
       </div>
  );
}

export default App;
