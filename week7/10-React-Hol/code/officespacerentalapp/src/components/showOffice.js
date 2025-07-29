import React from 'react';
import Office from './Office';
function colorRent(office)
{
    if(office.getRent() <= 60000){
        return "red";
    }else{
        return "green";
    }
}
export default function Show(props) {
    const office = new Office(props.name, props.rent, props.address, props.img);
    return (
        <div>
            <img src={office.getImg()} alt={office.getName()} width="25%" height="25%"/>
            <h1>Name : {office.getName()}</h1>
            <h3>Rent: <span style={{ color: colorRent(office) }}>Rs. {office.getRent()}</span></h3>
            <h3>Location: {office.getLocation()}</h3>
            
        </div>
    );
}