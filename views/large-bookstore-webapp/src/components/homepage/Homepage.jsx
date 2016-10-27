import React from 'react';
import RecommendBooks from './RecommendBooks';
import RecentlyViewBooks from './RecentlyViewBooks';
import BookClubs from './BookClubs';
import {Link} from 'react-router';

export default class Homepage extends React.Component {
    render () {
        return (
            <section className="homepage">
                <section className="homepage-banner">
                    <img src="http://placehold.it/960x300" />
                </section>
               <RecommendBooks />
               <RecentlyViewBooks /> 
               <BookClubs />               
            </section>
        );
    }
}
