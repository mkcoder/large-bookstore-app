import React from 'react';

const bookList = (item, index) => {
    return (
        <div key={item.index} className="userCard">
            <h1>{item.title} : By: {item.author}</h1>
            <h2>Price: {item.price}</h2>
            <p>{item.description}</p>
        </div>        
    );
}

export default bookList;