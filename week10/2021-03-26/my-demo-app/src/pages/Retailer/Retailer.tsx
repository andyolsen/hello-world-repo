import './Retailer.css'
import Product from '../Product/Product'
import Shop from '../Shop/Shop';

export default function Retailer({retailerName, products, shops}: any) {

    return (
        <fieldset id={retailerName}>        
            <legend>{retailerName}</legend>
            
            <h2>Catalog</h2>
            <ul>
                {/* This is a JSX comment */}
                {products.map((p: any, i: number) => <Product key={i} {...p} /> )}
            </ul>
            
            <h2>Shops</h2>
            <ul>
                {shops.map((s: any, i: number) => <Shop key={i} {...s} /> )} 
            </ul>
        </fieldset>
    )
}