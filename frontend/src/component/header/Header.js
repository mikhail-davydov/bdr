import {Component} from "react";
import Button from "../button/Button";
import Company from "../company/Company";
import User from "../user/User";

import "./Header.css";

class Header extends Component {

    render() {
        let userContent = <User/>;
        let companyContent = <Company/>;
        return (
            <header className="header">
                <Button content={userContent}/>
                <Button content={companyContent}/>
            </header>
        )
    }

}

export default Header;
