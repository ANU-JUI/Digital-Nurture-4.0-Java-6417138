import './App.css';
import Show from './components/showOffice';
import image1 from './image1.png';
import image2 from './image2.png';
import image3 from './image3.png';

function App() {
  // Create an array of office data objects
  const officeList = [
    { name: "Office 1", rent: 50000, address: "Downtown", img: image1 },
    { name: "Office 2", rent: 70000, address: "Uptown", img: image2 },
    { name: "Office 3", rent: 60000, address: "Midtown", img: image3 }
  ];

  return (
    <div className="App">
      <h1>Office Space at Affordable Range</h1>
      {officeList.map(office => (
        <Show
          name={office.name}
          rent={office.rent}
          address={office.address}
          img={office.img}
        />
      ))}
    </div>
  );
}

export default App;