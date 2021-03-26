import './Product.css'

export default function Product({key, description, price, unitsInStock}: any) {
    var c = price > 100 ?  'expensive':  'cheap'
    return <li key={key} className={c}>{description}, &pound;{price} [{unitsInStock} in stock]</li>
}