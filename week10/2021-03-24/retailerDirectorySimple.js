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
	
function Retailer({retailerName, products, shops}) {

    return (
        <fieldset id={retailerName}>        
            <legend>{retailerName}</legend>
            
            <h2>Catalog</h2>
            <ul>
                {products.map((product, i) => 
                    <li key={i}>{product.description} GBP {product.price} </li>
                )}
            </ul>
            
            <h2>Shops</h2>
            <ul>
                {shops.map((shop, i) =>
                    <li key={i}>{shop.city}, {shop.country.toUpperCase()}</li>
                )}
            </ul>
        </fieldset>
    )
}

const App = ({title, retailers}) =>
    <div>
        <header>
            <h1>{title}</h1>
        </header>
        <div>
            {retailers.map((retailer, i) =>
                <Retailer key={i} {...retailer} />
            )}
        </div>
    </div>

ReactDOM.render(
    <App retailers={retailersData} title="Totally Awesome Retailers Inc" />,
    document.getElementById("osl-container")
)
