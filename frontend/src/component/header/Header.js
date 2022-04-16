import {Component} from "react";
import Button from "../button/Button";
import CompanyList from "../company/__list/CompanyList";
import Company from "../company/Company";
import User from "../user/User";
import {UserSettings} from "../user/user-settings/UserSettings";

import "./Header.css";

class Header extends Component {

    constructor(props) {
        super(props);
        this.clickUserButton = this.clickUserButton.bind(this);
        this.clickUserSettingsItem = this.clickUserSettingsItem.bind(this);
        this.clickCompanyButton = this.clickCompanyButton.bind(this);
        this.clickCompanyItem = this.clickCompanyItem.bind(this);
        this.state = {
            userSettingsVisible: false,
            companiesVisible: false,
            companies: [
                {
                    id: 0, name: "Создать Компанию", isVisible: true,
                }
            ]
        }
    }

    render() {
        let userContent = this.getUserContent();
        let companyContent = this.getCompanyContent();
        return (
            <header className="header">
                <Button content={userContent}/>
                <UserSettings onClickItem={this.clickUserSettingsItem}
                              isVisible={this.state.userSettingsVisible}
                />
                <Button content={companyContent}/>
                <CompanyList onClickItem={this.clickCompanyItem}
                             isVisible={this.state.companiesVisible}
                             companies={this.state.companies}
                />
            </header>
        )
    }

    getUserContent() {
        return <User onClick={this.clickUserButton}/>;
    }

    clickUserButton() {
        this.setState({
            userSettingsVisible: !this.state.userSettingsVisible,
            companiesVisible: false
        })
    }

    clickUserSettingsItem() {
        this.setState({
            userSettingsVisible: false
        });
    }

    getCompanyContent() {
        return <Company companies={this.state.companies}
                        chevronUp={this.state.companiesVisible}
                        onClick={this.clickCompanyButton}
        />;
    }

    clickCompanyButton() {
        this.setState({
            companiesVisible: !this.state.companiesVisible,
            userSettingsVisible: false
        })
    }

    clickCompanyItem(key, companiesList) {
        companiesList.forEach(company => {
            company.isVisible = (company.id === key);
        });

        this.setState({
            companies: companiesList,
            companiesVisible: false
        });
    }

    componentDidMount() {
        //todo: fetch list from db
        let companiesList = [
            {
                id: 1, name: "Компания 1", isVisible: false,
            }, {
                id: 2, name: "Другая Компания", isVisible: false,
            }, {
                id: 3, name: "ООО Ромашка", isVisible: true,
            },
        ];

        if (!companiesList.length) {
            return;
        }

        this.setState({
            companies: companiesList
        });
    }

}

export default Header;
