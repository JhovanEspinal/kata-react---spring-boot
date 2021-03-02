import React from 'react';
import { BrowserRouter, Route, Switch } from "react-router-dom";
import page from '../pages/page';



const App = () => {
  return (
    <BrowserRouter> 
      <Switch>
        <Route path="/" component={page} />
      </Switch>
    </BrowserRouter>
  );
}

export default App;
