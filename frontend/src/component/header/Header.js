import {Component} from "react";
import Button from "../button/Button";
import Company from "../company/Company";
import User from "../user/User";

import "./Header.css";

class Header extends Component {

    constructor(props) {
        super(props);
        this.state = {
            visible: false,
            clickButton: this.onClick.bind(this),
        }
    }

    onClick() {
        console.log("button clicked");
        this.setState({
            visible: !this.state.visible
        })
    }

    render() {
        console.log("Visible: ", this.state.visible);
        let userContent = <User/>;
        let companyContent = <Company chevronUp={this.state.visible}/>;

        //todo: mock fetch list
        let companies = [
            {
                id: 1, name: "Company 1", isDefault: false,
            }, {
                id: 2, name: "Company 2", isDefault: true,
            }, {
                id: 3, name: "OOO ROMASHKA", isDefault: false,
            },
        ];
        let listItems = companies.map((company) => <li className="header__list-item" key={company.id}>
            {company.name}
        </li>);
        let listClassName = this.state.visible ? "header__list visible" : "header__list";

        return (
            <header className="header">
                <Button content={userContent}/>
                <Button content={companyContent} onClick={this.state.clickButton}/>
                <ul className={listClassName}>{listItems}</ul>
            </header>
        )
    }

}

export default Header;
