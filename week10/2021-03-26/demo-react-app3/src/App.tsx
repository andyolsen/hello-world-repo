import React from 'react';
import RestClient from './RestClient'

export default function App() {
  return (
    <React.Fragment>
      <div>Click a button to call a REST API [see Console for results]</div>
      <button onClick={() => demo1()}>GET all destinations</button>
      <button onClick={() => demo2()}>GET one destination</button>
      <button onClick={() => demo3()}>PUT review for destination</button>
    </React.Fragment>
  );
}

function demo1() {
  const promise = RestClient.getDestinations()
  promise.then(data => console.log(`All destinations: ${JSON.stringify(data)}`))
}

function demo2() {
  const promise = RestClient.getDestination(1)
  promise.then(data => console.log(`Destination 1: ${JSON.stringify(data)}`))
}

async function demo3() {
  
  const destination = await RestClient.getDestination(1)
  
  const review = {
    destination: destination,
    rating: 5, 
    comment: ' FANTASTIC',
    by: 'Andy'
  }
  
  const addResponse = await RestClient.addReview(1, review)
  console.log(addResponse)
}
