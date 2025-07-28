import React from 'react';
function Less({players}){
    var less70=new Array();
    return (
        players.map((item)=>{
        if(item.score<=70) {
            less70.push(item);}
        return(<div></div>);}),
     less70.map((item) => {
          return(
          <div>
            <li>Mr. {item.name} <span>{item.score}</span></li>
          </div>)
        })
    )
};
export default Less;