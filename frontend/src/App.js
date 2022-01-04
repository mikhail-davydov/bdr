import React from "react";
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import Home from './components/home/Home';
import Login from './components/login/Login';

class App extends React.Component {

    render() {
        return (
            <Router>
                <Routes>
                    <Route path="/" element={<Home/>}/>
                    <Route path="/login" element={<Login/>}/>
                </Routes>
            </Router>
        );
    }

}

export default App;
