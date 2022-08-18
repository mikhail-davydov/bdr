import {useEffect, useMemo, useState} from "react";
import {useGlobalFilter, useSortBy, useTable} from "react-table";

import "./PaymentsContent.css";

export default function PaymentsContent() {

    const [data, setData] = useState([]); // payments data
    const [filterInput, setFilterInput] = useState(""); // search field

    // search field: update the state when input changes
    const handleFilterChange = (e) => {
        const value = e.target.value || "";
        setGlobalFilter(value)
        setFilterInput(value);
    };

    useEffect(() => {

        // (async () => {
        //     const result = await axios("https://api.tvmaze.com/search/shows?q=snow");
        //     setData(result.data);
        // })();

        // todo: fetch payments from db with request to backend
        setData([
            {
                category: "Налоги",
                date: "01.01.2022",
                amount: 100,
                comment: "ОМС, первый квартал",
            },
            {
                category: "Новая Категория",
                date: "02.03.2022",
                amount: -99.04,
                comment: "Возврат долгов",
            },
            {
                category: "Еще одна другая категория",
                date: "03.04.2022",
                amount: 101,
                comment: "",
            },
        ])

    }, []);

    const columns = useMemo(
        () => [
            {
                Header: "Категория",
                accessor: "category", // accessor is the "key" in the data
            },
            {
                Header: "Дата",
                accessor: "date",
            },
            {
                Header: "Сумма",
                accessor: "amount",
            },
            {
                Header: "Комментарий",
                accessor: "comment",
            },
        ],
        []
    )

    const {
        getTableProps,
        getTableBodyProps,
        headerGroups,
        rows,
        prepareRow,
        setGlobalFilter
    } = useTable({columns, data},
        useGlobalFilter,
        useSortBy
    );

    return (

        <div className="payment-content">
            <input className="table-search"
                   value={filterInput}
                   onChange={handleFilterChange}
                   placeholder={"Поиск"}
            />
            <table className="payment-table" {...getTableProps()}>
                <thead className="payment-table__header">
                {headerGroups.map(headerGroup => (
                    <tr className="payment-table__header-row" {...headerGroup.getHeaderGroupProps()}>
                        {headerGroup.headers.map(column => (
                            <th  {...column.getHeaderProps(column.getSortByToggleProps())}
                                 className="payment-table__header-column"
                                // className={
                                //     column.isSorted
                                //         ? column.isSortedDesc
                                //             ? "payment-table__header-column chevron chevron--up"
                                //             : "payment-table__header-column chevron chevron--down"
                                //         : "payment-table__header-column"
                                // }
                            >
                                {column.render("Header")}
                            </th>
                        ))}
                    </tr>
                ))}
                </thead>
                <tbody className="payment-table__body" {...getTableBodyProps()}>
                {rows.map(row => {
                    prepareRow(row)
                    return (
                        <tr className="payment-table__body-row" {...row.getRowProps()}>
                            {row.cells.map(cell => {
                                return (
                                    <td className="payment-table__body-column" {...cell.getCellProps()}>
                                        {cell.render("Cell")}
                                    </td>
                                )
                            })}
                        </tr>
                    )
                })}
                </tbody>
            </table>
        </div>
    )

}