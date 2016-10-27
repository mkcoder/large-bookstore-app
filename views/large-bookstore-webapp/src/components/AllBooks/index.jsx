import React from 'react';
import {Link} from 'react-router';

export default class ViewAllBooks extends React.Component {
    constructor() {
        super();
        fetch('http://large-bookstore-app.dev/rest/book/all').then(function(response) { return response.text() }).then((text) => JSON.parse(text)).then((json) => console.log(json));                
    }
    render () {        
        return (
            <h1> I will show all the books </h1>
        );
    }
}