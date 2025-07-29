import React, { useState } from 'react';
function Currency(){
    const [amount, setAmount] = useState('');
    const [curr,setCurr]=useState('');
    const change=()=>{
        var amt=parseFloat(amount);
        if(curr ==='Euro'){
       var a=amt * 100.51;
    window.alert(`Converting the Euro Amount is: ₹${a.toFixed(2)}`);
        }
        else{
             a=amt * 0.0099;
    window.alert(`Converting the INR Amount is: ₹${a.toFixed(2)}`);
        }
    };
    const inputChange=(event)=>{
        setAmount(event.target.value);

    };
    const currChange=(event)=>{
        setCurr(event.target.value);
    }
    return(
        <div style={{ padding: '10px 20px'}}>
            <label for="myTextField">Amount:  </label>
            <input type="text" id="myTextField" name="myTextField" value={amount} onChange={inputChange} style={{ padding: '10px 20px', fontSize: '1rem', marginLeft: '10px' }}></input>
            <br></br>
                        <br></br>

            <label for="currency">Currency:  </label>
            <select id="currency" name="currency" value={curr} onChange={currChange} style={{ padding: '10px 20px', fontSize: '1rem', marginLeft: '10px' }}>
                <option value="INR">INR</option>
          <option value="Euro">Euro</option>
          
            </select>
            <br></br>
            <br></br>
            <button onClick={change} style={{ padding: '10px 20px', fontSize: '1rem', marginLeft: '10px' }}>
                Submit
            </button>
            </div>
    )
}
export default Currency;