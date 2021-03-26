import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './pages/App/App';

const retailersData = [
  {
      retailerName: "Acme Incorporated",
      products: [
          { description: "Swansea City Shirt", price: 53.00, unitsInStock: 501 },
          { "description": "Cardiff City Shirt", "price": 1.99,  "unitsInStock": 29000 },
          { "description": "Bugatti Divo", "price": 4000000, "unitsInStock": 5 },
          { "description": "55in OLED HDTV", "price": 1500, "unitsInStock": 25 },
      ],
      shops: [
          { "city": "London", "country": "UK" },
          { "city": "NY", "country": "USA" },
      ]
  },
  {
      retailerName: "Mountains'R'Us",
      products: [
          { "description": "Carving skis", "price": 350.00, "unitsInStock": 1000 },
          { "description": "Ski boots", "price": 170.50,  "unitsInStock": 700 },
      ],
      shops: [
          { "city": "Val d'Isere", "country": "France" },
          { "city": "St. Anton", "country": "Austria" },
          { "city": "Kitzbuhel", "country": "Austria" },
      ]
  },
]

ReactDOM.render(
  <React.StrictMode>
    <App retailers={retailersData} title='Totally awesome retailers' />
  </React.StrictMode>,
  document.getElementById('app-root')
);

