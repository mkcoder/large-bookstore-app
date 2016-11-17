import React from 'react';
import { Route, IndexRoute } from 'react-router';
import App from './components/App.jsx';
import Homepage from './components/homepage/Homepage.jsx';
import ViewAllBooks from './components/allbooks/index.jsx';

export default(
  <Route path="/" component={App}>
    <IndexRoute component={Homepage} />
    <Route path="viewAllBooks" component={ViewAllBooks} />
  </Route>
);
