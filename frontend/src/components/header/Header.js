import React from "react";
import User from "../user/User";
import UserIcon from "../user/user.svg";
import PayContent from "../content/PayContent";

import "../button/Button.css";

import "./Header.css";
import "./__menu/HeaderMenu.css";

class Header extends React.Component {

    handleClick(content) {
        this.props.handleButtonClick(content);
    }

    render() {
        let user = <img src={UserIcon} alt="User" className="user__img"/>;
        let categories = "Categories";
        let payItems = <PayContent handleButtonClick={this.props.handleButtonClick}/>;

        return (
            <header className="header">
                <button className="button" type="button" onClick={this.handleClick.bind(this, user)}>
                    <User/>
                </button>
                <ul className="header__menu">
                    <li className="header__menu-item">
                        <button className="button" type="button" onClick={this.handleClick.bind(this, payItems)}>
                            Приход/Расход
                        </button>
                    </li>
                    <li className="header__menu-item">
                        <button className="button" type="button" onClick={this.handleClick.bind(this, categories)}>
                            Категории
                        </button>
                    </li>
                </ul>
            </header>
        )
    }

}

export default Header;