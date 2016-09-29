import React from 'react';
import { Route, IndexRoute } from 'react-router';
import App from './components/app.jsx';
import Homepage from './components/homepage/Homepage.jsx';


export default(
  <Route path="/" component={App}>
    <IndexRoute component={Homepage} />
  </Route>
);
