import {Component} from "react";
import "./header.css"

class Header extends Component {

    render() {
        return (
            <header className="header">
                <div className="user-container">
                    user here
                </div>
                <div className="companies-container">
                    companies here
                </div>
            </header>
        )
    }

}

export default Header;
