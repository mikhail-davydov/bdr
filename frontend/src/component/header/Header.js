import {Component} from "react";
import User from "../user/User";

import "./Header.css";

class Header extends Component {

    render() {
        return (
            <header className="header">
                <User/>
                <div className="companies-container">
                    companies here
                </div>
            </header>
        )
    }

}

export default Header;
