import React from "react";
import { useParams } from "react-router-dom";
import { RestClient } from "./RestClient"

export default function Destination() {
	
	let { id } : any = useParams();
	let [destination, setDestination] = React.useState<any>(undefined)

	React.useEffect(() => {
		RestClient.getDestination(id)
		          .then(destination => setDestination(destination))
				  .catch((err: any) => alert(err))
	}, [id])

	if (destination) {
		return (
			<React.Fragment>
				<DestinationDetails {...destination} />
				<DestinationReviews {...destination} />
			</React.Fragment>
		)
	} else {
		return <p>...</p>
	}
}

function DestinationDetails(destination: any) {
	return (
		<div>
			<h1>{destination.place}</h1>
			<p>
				<label>Country</label>
				<span>{destination.country}</span>
			</p>
			<p>
				<label>Latitude</label>
				<span>{destination.latitude}</span>
			</p>
			<p>
				<label>Longitude</label>
				<span>{destination.longitude}</span>
			</p>
			<p>
				<label>Info</label>
				<span>{destination.info}</span>
			</p>
			<p>
				<img src={RestClient.baseUrl + "/" + destination.image}
				     alt={destination.place} />
			</p>
		</div>
	)
}

function DestinationReviews(destination: any) {
	return (
		<React.Fragment>
			{ReviewsMarkup(destination)}
			{AddReviewFormMarkup(destination)}
		</React.Fragment>
	)
}

function ReviewsMarkup(destination: any) {
	if (!destination.reviews || !destination.reviews.length) {
		return <div>No reviews yet</div>
	}
	else {
		return (
			<div>
				<h2>Reviews</h2>
				{destination.reviews.map((r: any, i: number) => 
					<p key={i}>
						<span className='rating'>{r.rating}</span>
						<span className='comment'>{r.comment}</span>
						<span className='by'> [{r.by}]</span>
					</p>
				)}
			</div>
		)
	}
}

function AddReviewFormMarkup(destination: any) {

	const [value, setValue] = React.useState(0) 

	const handleSubmit = (e: any) => {
		e.preventDefault();
		let review = {
			rating:  (document.getElementById('rating') as HTMLInputElement).value,
			comment: (document.getElementById('comment') as HTMLInputElement).value,
			by:      (document.getElementById('by') as HTMLInputElement).value
		}
		RestClient.addReview(destination.id, review)
		          .then( () => {
					  window.alert('Thanks dude!')
					  e.target.reset()
					  destination.reviews.push(review)
					  setValue(value => value + 1)
				  })
				  .catch( (e: any) => alert(e))
	}

	return (
		<div>
			<h2>Add Review</h2>
			<form onSubmit={handleSubmit}>
				<p>
					<label htmlFor='rating'>Rating</label>
					<input id='rating' type='number' min={1} max={5}/>
				</p>
				<p>
					<label htmlFor='comment'>Comment</label>
					<textarea id='comment' rows={3} cols={20}/>
				</p>
				<p>
					<label htmlFor='by'>Your name</label>
					<input type='text' id='by'/>
				</p>
				<p>
					<label>&nbsp;</label> {/* Placeholder */}
					<button>Add review</button>
				</p>
			</form>
		</div>
	)}