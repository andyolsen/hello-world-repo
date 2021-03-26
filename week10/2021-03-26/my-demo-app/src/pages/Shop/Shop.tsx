export default function Shop({key, city, country}: any) {
    return <li key={key}>{city}, {country.toUpperCase()}</li>
}
