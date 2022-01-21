import React from "react";
import User from "../user/User";
import UserIcon from "../user/user.svg";
import PayContent from "../content/PayContent";
import Button from "../button/Button";

import "./Header.css";
import "./__menu/HeaderMenu.css";

class Header extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            buttonClass: "button"
        };
    }

    handleClick(content) {
        this.props.handleButtonClick(content);
    }

    render() {
        let userIcon = <img src={UserIcon} alt="User" className="user__img"/>;
        let categories = "Categories";
        let payItems = <PayContent handleButtonClick={this.props.handleButtonClick}/>;

        let user = <User/>;

        return (
            <header className="header">
                <Button buttonClass={this.state.buttonClass}
                        handleClick={this.handleClick.bind(this, userIcon)}
                        buttonValue={user}
                />
                <ul className="header__menu">
                    <li className="header__menu-item">
                        <Button buttonClass={this.state.buttonClass}
                                handleClick={this.handleClick.bind(this, payItems)}
                                buttonValue="Приход/Расход"
                        />
                    </li>
                    <li className="header__menu-item">
                        <Button buttonClass={this.state.buttonClass}
                                handleClick={this.handleClick.bind(this, categories)}
                                buttonValue="Категории"
                        />
                    </li>
                </ul>
            </header>
        )
    }

}

export default Header;