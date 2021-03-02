import React, { useReducer, createContext } from 'react';
import Form from '../Components/Form';
import List from '../Components/List';
import reducer from '../reducer/reducer';
import { Link } from 'react-router-dom';  

const initialState = { todo: { list: [], item: {} } };

const Store = createContext(initialState);

const StoreProvider = ({ children }) => {
    const [state, dispatch] = useReducer(reducer, initialState);
    return <Store.Provider value={{ state, dispatch }}>
        {children}
    </Store.Provider>
}

function page() {
    return <StoreProvider>
        <h3>ToDo List</h3>
        <Form params={Store} />
        <List params={Store} />
    </StoreProvider>
}
export default page;