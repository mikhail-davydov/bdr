import {Component} from "react";
import Button from "../button/Button";
import CompanyListItem from "../company/__list-item/CompanyListItem";
import CompanyList from "../company/__list/CompanyList";
import Company from "../company/Company";
import User from "../user/User";

import "./Header.css";

class Header extends Component {

    constructor(props) {
        super(props);
        this.clickCompanyButton = this.clickCompanyButton.bind(this);
        this.clickCompanyItem = this.clickCompanyItem.bind(this);
        this.state = {
            visible: false,
            companies: [
                {
                    id: 0, name: "create company", isVisible: true,
                }
            ]
        }
    }

    render() {
        let userContent = <User/>;

        let visibleCompany = this.state.companies.find(company => company.isVisible);
        let companyContent = <Company visibleCompany={visibleCompany.name} chevronUp={this.state.visible}/>;

        let companies = this.state.companies
            .filter(company => !company.isVisible)
            .map((company) =>
                <CompanyListItem key={company.id}
                                 onClick={(e) => this.clickCompanyItem(company.id, this.state.companies, e)}
                                 content={company.name}

                />
            );
        let companiesClassName = this.state.visible ? "company__list visible" : "company__list";

        return (
            <header className="header">
                <Button content={userContent}/>
                <Button content={companyContent} onClick={this.clickCompanyButton}/>
                <CompanyList className={companiesClassName} content={companies}/>
            </header>
        )
    }

    clickCompanyItem(key, companiesList) {
        companiesList.forEach(company => {
            company.isVisible = (company.id === key);
        });

        this.setState({
            companies: companiesList,
            visible: false
        });
    }

    clickCompanyButton() {
        this.setState({
            visible: !this.state.visible
        })
    }

    componentDidMount() {
        this.setState({
            //todo: fetch list from db
            companies: [
                {
                    id: 1, name: "Company 1", isVisible: false,
                }, {
                    id: 2, name: "Company 2", isVisible: false,
                }, {
                    id: 3, name: "OOO ROMASHKA", isVisible: true,
                },
            ]
        })
    }

}

export default Header;
