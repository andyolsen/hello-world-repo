import React from "react";
import { Link } from "react-router-dom";
import { RestClient } from "./RestClient"

function Destinations() {

	let [destinations, setDestinations] = React.useState<Array<any>>([])

	React.useEffect(() => {
		RestClient.getDestinations()
		          .then(destinations => setDestinations(destinations))
	}, [])

	return (
		<div>
			<h1>Destinations</h1>
			{destinations.map((dest: any, i: number) =>
				<Link key={i} className='blockLink' to={`destination/${dest.id}`}>{dest.place}</Link>
			)}
		</div>
    )
}
export default Destinations;