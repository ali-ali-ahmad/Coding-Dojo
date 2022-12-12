import React from 'react';
import { createContext } from 'react';

const Flipping = () => {

  function tossCoin() {
      return Math.random() > 0.5 ? "heads" : "tails";
    }

  function fiveHeadsSync() {
        let headsCount = 0;
        const HeadNum = createContext(headsCount);
        let attempts = 0;
        while(headsCount < 5) {
            attempts++;
            let result = tossCoin();
            console.log(`${result} was flipped`);
            if(result === "heads") {
                headsCount++;
              } else {
                headsCount = 0;
            }
        }
        return `It took ${attempts} tries to flip five "heads"`;
    }
    console.log( fiveHeadsSync() );
    console.log( "This is run after the fiveHeadsSync function completes" );
      
  function fiveHeads() {
        return new Promise( (resolve, reject) => {
              // your code here!
              if(HeadNum === 2) {
                resolve("Great!, You got 5 head in a row");
              } else {
                reject("Try Again");
              }
        });
    }
    fiveHeads()
        .then( res => console.log(res) )
        .catch( err => console.log(err) );
    console.log( "When does this run now?" );
      
    
  return (
    <div>
      
    </div>
  );
}

export default Flipping;
