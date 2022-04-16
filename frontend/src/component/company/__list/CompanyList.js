import {Component} from "react";
import CompanyListItem from "../__list-item/CompanyListItem";

import "./CompanyList.css";

class CompanyList extends Component {

    render() {
        let companyListClassName = this.getCompaniesClassName();
        let companies = this.getCompaniesList();
        return (
            <ul className={companyListClassName}>
                {companies}
            </ul>
        )
    }

    getCompaniesList() {
        return this.props.companies
            .filter(company => !company.isVisible)
            .map((company) =>
                <CompanyListItem key={company.id}
                                 onClick={(e) => this.props.onClickItem(company.id, this.props.companies, e)}
                                 content={company.name}
                />
            );
    }

    getCompaniesClassName() {
        return this.props.isVisible ? "company__list visible" : "company__list";
    }

}

export default CompanyList;